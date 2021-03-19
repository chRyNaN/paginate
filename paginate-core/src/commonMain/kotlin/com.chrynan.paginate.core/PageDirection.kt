@file:Suppress("unused")

package com.chrynan.paginate.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An enum class representing the possible directions to load data in a [PaginateRepository] with respect to a
 * reference key value.
 */
@Serializable
enum class PageDirection(val typeName: String) {

    /**
     * Indicates loading data before the reference key value.
     */
    @SerialName(value = "before")
    BEFORE(typeName = "before"),

    /**
     * Indicates loading data after the reference key value.
     */
    @SerialName(value = "after")
    AFTER(typeName = "after");

    companion object {

        fun getByTypeName(typeName: String, ignoreCase: Boolean = true): PageDirection? =
            values().firstOrNull { it.typeName.equals(typeName, ignoreCase) }
    }
}
