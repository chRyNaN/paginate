@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.chrynan.paginate.core

import com.chrynan.paginate.core.PaginateRepository.Companion.DEFAULT_LOAD_COUNT
import kotlinx.coroutines.flow.*

/**
 * A base implementation of the [PaginateRepository] interface. This abstract class provides most of the implementation
 * of the [PaginateRepository] interface leaving only the [fetch] function to be implemented by subclasses.
 */
abstract class BasePaginateSource<K : Any, T : Any> : PaginateRepository<K, T> {

    override var currentPage: PagedResult<K, T>? = null
        protected set

    /**
     * The [MutableStateFlow] used for the [loadPages] function.
     */
    protected val pageStateFlow = MutableStateFlow<PagedResult<K, T>?>(null)

    /**
     * The [MutableStateFlow] used for the [loadAllPages] function.
     */
    protected val allPagesStateFlow = MutableStateFlow<List<PagedResult<K, T>>?>(null)

    /**
     * A [MutableMap] of all of the currently loaded items.
     */
    protected val pages = mutableMapOf<Int, PagedResult<K, T>>()

    /**
     * Retrieves the [PagedResult] using the provided [count], [key], [direction], and [currentPageCount] parameters.
     * This abstract function must be implemented by subclasses and connects the underlying data source with this
     * [PaginateRepository]. For instance, a subclass might provide an implementation of this function that loads the
     * data from a REST API using some HTTP Client.
     *
     * Note that it is up to the implementation of this function to provide a [PagedResult] wrapper around the
     * resulting [List] of items. This requires the implementation to create a [PageInfo] class. The [PageInfo.index]
     * value needs to be unique and ordered for each page for this class to work correctly. One way to create an index
     * would be to use the [currentPageCount] parameter. Note, however, it is possible for pages to be skipped by
     * providing a [key] from a further page. It is up to the implementation to handle this functionality if desired.
     * Handling that scenario might be possible using [currentPageCount] and [currentPage], along with possibly
     * ignoring the desired [count] value and using a fixed value instead.
     *
     * Note that it's possible for more data to be available over time, for instance, the first page is loaded but
     * newer items are added "before" the first page. For this scenario, the implementation could either use negative
     * [PageInfo.index] values or wait until either the [PaginateRepository.reset] or one of the refresh extension
     * functions is called.
     *
     * @param [count] The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT]. Note that there's no
     * guarantee that [count] amount of items will be returned. The amount of returned items might be more or less than
     * the provided [count].
     *
     * @param [key] The optional identifier value of the last loaded item, used as a reference to load items before or
     * after that item in the underlying data set.
     *
     * @param [direction] The direction to load more items with respect to [key]. For instance, [PageDirection.AFTER]
     * will load items after the item with the [key].
     *
     * @param [currentPageCount] The amount of pages already loaded for this [PaginateRepository].
     */
    abstract suspend fun fetch(count: Int, key: K?, direction: PageDirection, currentPageCount: Int): PagedResult<K, T>

    override fun loadPages(count: Int, key: K?, direction: PageDirection): Flow<PagedResult<K, T>> =
        pageStateFlow.asSharedFlow()
            .onSubscription {
                if (pageStateFlow.value == null) {
                    loadSinglePage(count = count, key = key, direction = direction)
                }
            }
            .filterNotNull()

    override fun loadAllPages(count: Int, key: K?, direction: PageDirection): Flow<List<PagedResult<K, T>>> =
        allPagesStateFlow.asSharedFlow()
            .onSubscription {
                if (allPagesStateFlow.value == null) {
                    loadSinglePage(count = count, key = key, direction = direction)
                }
            }
            .filterNotNull()

    override suspend fun loadSinglePage(count: Int, key: K?, direction: PageDirection): PagedResult<K, T> {
        val result = fetch(count = count, key = key, direction = direction, currentPageCount = pages.size)

        dispatchResult(result)

        return result
    }

    override suspend fun previous(count: Int): PagedResult<K, T> {
        // We can only throw an exception if we have a current page and it's PageInfo.hasPreviousPage value was
        // explicitly set to false. Otherwise we leave it up to the fetch function to handle whether there are previous
        // pages.
        if (currentPage?.info?.hasPreviousPage == false) throw PageOutOfBoundsException("There are no previous pages. Current page = $currentPage")

        val key = currentPage?.info?.firstKey

        return loadSinglePage(count = count, key = key, direction = PageDirection.BEFORE)
    }

    override suspend fun next(count: Int): PagedResult<K, T> {
        // We can only throw an exception if we have a current page and it's PageInfo.hasNextPage value was
        // explicitly set to false. Otherwise we leave it up to the fetch function to handle whether there are next
        // pages.
        if (currentPage?.info?.hasNextPage == false) throw PageOutOfBoundsException("There are no next pages. Current page = $currentPage")

        val key = currentPage?.info?.lastKey

        return loadSinglePage(count = count, key = key, direction = PageDirection.AFTER)
    }

    override suspend fun reset() {
        currentPage = null

        pages.clear()

        pageStateFlow.value = PagedResult(info = PageInfo(index = 0, hasNextPage = true))
        allPagesStateFlow.value = emptyList()
        pageStateFlow.value = null
        allPagesStateFlow.value = null
    }

    @Suppress("RedundantSuspendModifier")
    private suspend fun dispatchResult(result: PagedResult<K, T>) {
        currentPage = result

        pageStateFlow.value = result

        pages[result.info.index] = result

        allPagesStateFlow.value = pages.entries
            .sortedBy { it.key }
            .map { it.value }
    }

    companion object
}
