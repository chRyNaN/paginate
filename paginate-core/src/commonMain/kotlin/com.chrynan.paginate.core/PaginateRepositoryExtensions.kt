@file:Suppress("unused")

package com.chrynan.paginate.core

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

/**
 * A convenience function for calling [PaginateRepository.loadPages] but instead of returning a [Flow] of
 * [PagedResult]s, it returns a [Flow] of a [List] of the [T] items from the [PagedResult.items] property.
 *
 * @see [PaginateRepository.loadPages]
 * @see [PagedResult.items]
 */
fun <T : Any, K : Any> PaginateRepository<T, K>.loadPageItems(
    count: Int = PaginateRepository.DEFAULT_LOAD_COUNT,
    key: K? = null,
    direction: PageDirection = PageDirection.AFTER
): Flow<List<T>> =
    loadPages(
        count = count,
        key = key,
        direction = direction
    ).map { it.items }

/**
 * A convenience function for calling [PaginateRepository.loadAllPages] but instead of returning a [Flow] of a [List]
 * of [PagedResult]s, it returns a [Flow] of a [List] of the [T] items from the [PagedResult.items] property.
 *
 * @see [PaginateRepository.loadAllPages]
 * @see [PagedResult.items]
 */
fun <T : Any, K : Any> PaginateRepository<T, K>.loadAllPagesItems(
    count: Int = PaginateRepository.DEFAULT_LOAD_COUNT,
    key: K? = null,
    direction: PageDirection = PageDirection.AFTER
): Flow<List<T>> =
    loadAllPages(
        count = count,
        key = key,
        direction = direction
    ).map { pages ->
        pages.sortedBy { it.info.index }
            .distinctBy { it.info.index }
            .flatMap { it.items }
    }

/**
 * Refreshes the data in this [PaginateRepository] by calling [PaginateRepository.reset] and then returning
 * [PaginateRepository.loadPages].
 *
 * @see [PaginateRepository.reset]
 * @see [PaginateRepository.loadPages]
 */
fun <T : Any, K : Any> PaginateRepository<T, K>.refreshPages(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<PagedResult<T, K>> =
    loadPages(count = count)
        .onStart { reset() }

/**
 * Refreshes the data in this [PaginateRepository] by calling [PaginateRepository.reset] and then returning
 * [PaginateRepository.loadAllPages].
 *
 * @see [PaginateRepository.reset]
 * @see [PaginateRepository.loadAllPages]
 */
fun <T : Any, K : Any> PaginateRepository<T, K>.refreshAllPages(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<List<PagedResult<T, K>>> =
    loadAllPages(count = count)
        .onStart { reset() }

/**
 * Refreshes the data in this [PaginateRepository] by calling [PaginateRepository.reset] and then returning
 * [PaginateRepository.loadPageItems].
 *
 * @see [PaginateRepository.reset]
 * @see [PaginateRepository.loadPageItems]
 */
fun <T : Any, K : Any> PaginateRepository<T, K>.refreshPageItems(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<List<T>> =
    loadPageItems(count = count)
        .onStart { reset() }

/**
 * Refreshes the data in this [PaginateRepository] by calling [PaginateRepository.reset] and then returning
 * [PaginateRepository.loadAllPagesItems].
 *
 * @see [PaginateRepository.reset]
 * @see [PaginateRepository.loadAllPagesItems]
 */
fun <T : Any, K : Any> PaginateRepository<T, K>.refreshAllPagesItems(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<List<T>> =
    loadAllPagesItems(count = count)
        .onStart { reset() }

/**
 * Calls the [PaginateRepository.loadSinglePage] function and returns it's result or null if a
 * [PageOutOfBoundsException] was thrown.
 *
 * @see [PaginateRepository.loadSinglePage]
 * @see [PageOutOfBoundsException]
 */
suspend fun <T : Any, K : Any> PaginateRepository<T, K>.loadSinglePageOrNull(
    count: Int = PaginateRepository.DEFAULT_LOAD_COUNT,
    key: K? = null,
    direction: PageDirection = PageDirection.AFTER
): PagedResult<T, K>? =
    try {
        loadSinglePage(count = count, key = key, direction = direction)
    } catch (exception: PageOutOfBoundsException) {
        null
    }

/**
 * Calls the [PaginateRepository.previous] function and returns it's result or null if a [PageOutOfBoundsException] was
 * thrown.
 *
 * @see [PaginateRepository.previous]
 * @see [PageOutOfBoundsException]
 */
suspend fun <T : Any, K : Any> PaginateRepository<T, K>.nextOrNull(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): PagedResult<T, K>? =
    try {
        next(count = count)
    } catch (exception: PageOutOfBoundsException) {
        null
    }

/**
 * Calls the [PaginateRepository.next] function and returns it's result or null if a [PageOutOfBoundsException] was
 * thrown.
 *
 * @see [PaginateRepository.next]
 * @see [PageOutOfBoundsException]
 */
suspend fun <T : Any, K : Any> PaginateRepository<T, K>.previousOrNull(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): PagedResult<T, K>? =
    try {
        previous(count = count)
    } catch (exception: PageOutOfBoundsException) {
        null
    }
