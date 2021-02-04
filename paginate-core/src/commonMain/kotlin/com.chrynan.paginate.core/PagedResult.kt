package com.chrynan.paginate.core

/**
 * Represents a result from loading data from a [PaginateRepository].
 *
 * @property [info] The [PageInfo] for the resulting loaded page.
 *
 * @property [items] The [List] of [T] items for the resulting loaded page.
 */
data class PagedResult<T : Any, K : Any>(
    val info: PageInfo<K>,
    val items: List<T> = emptyList()
)
