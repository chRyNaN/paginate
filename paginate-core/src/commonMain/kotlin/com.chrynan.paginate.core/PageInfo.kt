package com.chrynan.paginate.core

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
data class PageInfo<K : Any>(
    val index: Int,
    val hasPreviousPage: Boolean = false,
    val hasNextPage: Boolean = false,
    val firstKey: K? = null,
    val lastKey: K? = null
)
