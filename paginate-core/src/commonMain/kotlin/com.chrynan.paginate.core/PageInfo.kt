package com.chrynan.paginate.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents information about a particular page loaded from a [PaginateRepository].
 *
 * @property [index] The unique index value indicating the position of this page with respect to other pages.
 *
 * @property [hasPreviousPage] Indicates whether there is a page before this page. True if there is a page that can be
 * loaded before this page, false otherwise.
 *
 * @property [hasNextPage] Indicates whether there is a page after this page. True if there is a page that can be
 * loaded after this page, false otherwise.
 *
 * @property [firstKey] The key value of the first item of this page. This should correspond to the first item in the
 * [PagedResult.items] value. This should be null if there are no items on this page.
 *
 * @property [lastKey] The key value of the last item of this page. This should correspond to the last item in the
 * [PagedResult.items] value. This should be null if there are no items on this page.
 */
@Serializable
data class PageInfo<K : Any>(
    @SerialName(value = "index") val index: Int,
    @SerialName(value = "has_previous_page") val hasPreviousPage: Boolean = false,
    @SerialName(value = "has_next_page") val hasNextPage: Boolean = false,
    @SerialName(value = "first_key") val firstKey: K? = null,
    @SerialName(value = "last_key") val lastKey: K? = null
)
