@file:Suppress("unused")

package com.chrynan.paginate.core

/**
 * An enum class representing the possible directions to load data in a [PaginateRepository] with respect to a
 * reference key value.
 */
enum class PageDirection {

    /**
     * Indicates loading data before the reference key value.
     */
    BEFORE,

    /**
     * Indicates loading data after the reference key value.
     */
    AFTER
}
