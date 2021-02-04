package com.chrynan.paginate.core

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow

/**
 * An interface representing a stateful repository of data that provides a way to load a possibly large data set in
 * smaller [PagedResult] sections, rather than loading the entire data set at once.
 */
interface PaginateRepository<T : Any, K : Any> {

    /**
     * The current, or last loaded, data set section. A value of null indicates that there are no pages loaded.
     */
    val currentPage: PagedResult<T, K>?

    /**
     * Retrieves a [Flow] of [PagedResult]s starting with any previously loaded [PagedResult]s, followed by the
     * [PagedResult] retrieved using the [count], [key], and [direction] parameters, and continues emitting
     * [PagedResult]s, for as long as subscribed to, for subsequent calls to [previous], [next], [loadSinglePage], or
     * any of their variants.
     *
     * Note that this function is similar to the [loadAllPages] function but instead of returning a [Flow] that just
     * emits a single [PagedResult] each time a new page is retrieved, the [loadAllPages] function emits a list of all
     * of the [PagedResult]s retrieved each time a new page is retrieved.
     *
     * Note that this returns a Hot Shared Flow. That means the [Flow]s returned from subsequent calls to this function
     * share an upstream [SharedFlow], and that the last emitted values are retained between calls to this function
     * until the [reset] function is called.
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
     * @see [loadAllPages]
     */
    fun loadPages(
        count: Int = DEFAULT_LOAD_COUNT,
        key: K? = null,
        direction: PageDirection = PageDirection.AFTER
    ): Flow<PagedResult<T, K>>

    /**
     * Retrieves a [Flow] of a [List] of [PagedResult]s starting with any previously loaded [PagedResult]s, followed by
     * the [PagedResult] retrieved using the [count], [key], and [direction] parameters, and continues emitting
     * [PagedResult]s, for as long as subscribed to, for subsequent calls to [previous], [next], [loadSinglePage], or
     * any of their variants.
     *
     * Note that this function is similar to the [loadPages] function but instead of returning a [Flow] that just emits
     * a single [PagedResult] each time a new page is retrieved, this [loadAllPages] function emits a list of all of
     * the [PagedResult]s retrieved each time a new page is retrieved.
     *
     * Note that this returns a Hot Shared Flow. That means the [Flow]s returned from subsequent calls to this function
     * share an upstream [SharedFlow], and that the last emitted values are retained between calls to this function
     * until the [reset] function is called.
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
     * @see [loadPages]
     */
    fun loadAllPages(
        count: Int = DEFAULT_LOAD_COUNT,
        key: K? = null,
        direction: PageDirection = PageDirection.AFTER
    ): Flow<List<PagedResult<T, K>>>

    /**
     * Retrieves a [PagedResult] using the provided [count], [key], and [direction] values, or throws a
     * [PageOutOfBoundsException] if there are no more pages in the provided [direction]. When the value is retrieved,
     * it will be dispatched to the [SharedFlow]s for all subscribers before being returned.
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
     */
    suspend fun loadSinglePage(
        count: Int = DEFAULT_LOAD_COUNT,
        key: K? = null,
        direction: PageDirection = PageDirection.AFTER
    ): PagedResult<T, K>

    /**
     * Retrieves the previous [PagedResult] from the [currentPage] using the provided [count] value, or throws a
     * [PageOutOfBoundsException] if there is no previous page. When the value is retrieved, it will be dispatched to
     * the [SharedFlow]s for all subscribers before being returned.
     *
     * @param [count] The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT]. Note that there's no
     * guarantee that [count] amount of items will be returned. The amount of returned items might be more or less than
     * the provided [count].
     *
     * @see [next]
     */
    suspend fun previous(count: Int = DEFAULT_LOAD_COUNT): PagedResult<T, K>

    /**
     * Retrieves the next [PagedResult] from the [currentPage] using the provided [count] value, or throws a
     * [PageOutOfBoundsException] if there is no next page. When the value is retrieved, it will be dispatched to the
     * [SharedFlow]s for all subscribers before being returned.
     *
     * @param [count] The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT]. Note that there's no
     * guarantee that [count] amount of items will be returned. The amount of returned items might be more or less than
     * the provided [count].
     *
     * @see [previous]
     */
    suspend fun next(count: Int = DEFAULT_LOAD_COUNT): PagedResult<T, K>

    /**
     * Resets this stateful repository back to it's original state before calling any of the functions to load data.
     * Effectively clearing all the currently stored pages and emitting empty values to all the [SharedFlow]s.
     */
    suspend fun reset()

    companion object {

        /**
         * The default desired number of items to load. This is an arbitrarily chosen number.
         */
        const val DEFAULT_LOAD_COUNT = 25
    }
}
