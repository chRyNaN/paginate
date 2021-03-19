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
fun <K : Any, T : Any> PaginateRepository<K, T>.loadPageItems(
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
fun <K : Any, T : Any> PaginateRepository<K, T>.loadAllPagesItems(
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
fun <K : Any, T : Any> PaginateRepository<K, T>.refreshPages(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<PagedResult<K, T>> =
    loadPages(count = count)
        .onStart { reset() }

/**
 * Refreshes the data in this [PaginateRepository] by calling [PaginateRepository.reset] and then returning
 * [PaginateRepository.loadAllPages].
 *
 * @see [PaginateRepository.reset]
 * @see [PaginateRepository.loadAllPages]
 */
fun <K : Any, T : Any> PaginateRepository<K, T>.refreshAllPages(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<List<PagedResult<K, T>>> =
    loadAllPages(count = count)
        .onStart { reset() }

/**
 * Refreshes the data in this [PaginateRepository] by calling [PaginateRepository.reset] and then returning
 * [PaginateRepository.loadPageItems].
 *
 * @see [PaginateRepository.reset]
 * @see [PaginateRepository.loadPageItems]
 */
fun <K : Any, T : Any> PaginateRepository<K, T>.refreshPageItems(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<List<T>> =
    loadPageItems(count = count)
        .onStart { reset() }

/**
 * Refreshes the data in this [PaginateRepository] by calling [PaginateRepository.reset] and then returning
 * [PaginateRepository.loadAllPagesItems].
 *
 * @see [PaginateRepository.reset]
 * @see [PaginateRepository.loadAllPagesItems]
 */
fun <K : Any, T : Any> PaginateRepository<K, T>.refreshAllPagesItems(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<List<T>> =
    loadAllPagesItems(count = count)
        .onStart { reset() }

/**
 * Calls the [PaginateRepository.loadSinglePage] function and returns it's result or null if a
 * [PageOutOfBoundsException] was thrown.
 *
 * @see [PaginateRepository.loadSinglePage]
 * @see [PageOutOfBoundsException]
 */
suspend fun <K : Any, T : Any> PaginateRepository<K, T>.loadSinglePageOrNull(
    count: Int = PaginateRepository.DEFAULT_LOAD_COUNT,
    key: K? = null,
    direction: PageDirection = PageDirection.AFTER
): PagedResult<K, T>? =
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
suspend fun <K : Any, T : Any> PaginateRepository<K, T>.nextOrNull(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): PagedResult<K, T>? =
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
suspend fun <K : Any, T : Any> PaginateRepository<K, T>.previousOrNull(count: Int = PaginateRepository.DEFAULT_LOAD_COUNT): PagedResult<K, T>? =
    try {
        previous(count = count)
    } catch (exception: PageOutOfBoundsException) {
        null
    }
