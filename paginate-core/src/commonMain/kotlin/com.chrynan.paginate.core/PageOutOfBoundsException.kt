@file:Suppress("unused")

package com.chrynan.paginate.core

/**
 * A [RuntimeException] that indicates an attempt to load a page number, from a [PaginateRepository], that is less than
 * the first page number or greater than the last page number.
 */
class PageOutOfBoundsException : RuntimeException {

    /**
     * Creates an instance of the [PageOutOfBoundsException] with the provided error [message].
     */
    constructor(message: String?) : super(message)

    /**
     * Creates an instance of the [PageOutOfBoundsException] with the provided [index], [minIndex], and [maxIndex]
     * which are used to create an error message.
     */
    constructor(
        index: Int,
        minIndex: Int,
        maxIndex: Int
    ) : super("Index $index is not within the bounds $minIndex to $maxIndex.")
}
