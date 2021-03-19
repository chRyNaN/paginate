package com.chrynan.paginate.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a result from loading data from a [PaginateRepository].
 *
 * @property [info] The [PageInfo] for the resulting loaded page.
 *
 * @property [items] The [List] of [T] items for the resulting loaded page.
 */
@Serializable
data class PagedResult<K : Any, T : Any>(
    @SerialName(value = "info") val info: PageInfo<K>,
    @SerialName(value = "items") val items: List<T> = emptyList()
) {

    companion object
}
