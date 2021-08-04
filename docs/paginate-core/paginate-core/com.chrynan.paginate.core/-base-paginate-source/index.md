//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[BasePaginateSource](index.md)

# BasePaginateSource

[common]\
abstract class [BasePaginateSource](index.md)<[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> : [PaginateRepository](../-paginate-repository/index.md)<[K](index.md), [T](index.md)> 

A base implementation of the [PaginateRepository](../-paginate-repository/index.md) interface. This abstract class provides most of the implementation of the [PaginateRepository](../-paginate-repository/index.md) interface leaving only the [fetch](fetch.md) function to be implemented by subclasses.

## Constructors

| | |
|---|---|
| [BasePaginateSource](-base-paginate-source.md) | [common]<br>fun [BasePaginateSource](-base-paginate-source.md)() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [fetch](fetch.md) | [common]<br>abstract suspend fun [fetch](fetch.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md), currentPageCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)><br>Retrieves the [PagedResult](../-paged-result/index.md) using the provided [count](fetch.md), [key](fetch.md), [direction](fetch.md), and [currentPageCount](fetch.md) parameters. |
| [loadAllPages](load-all-pages.md) | [common]<br>open override fun [loadAllPages](load-all-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): Flow<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>>><br>Retrieves a Flow of a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [PagedResult](../-paged-result/index.md)s starting with any previously loaded [PagedResult](../-paged-result/index.md)s, followed by the [PagedResult](../-paged-result/index.md) retrieved using the [count](load-all-pages.md), [key](load-all-pages.md), and [direction](load-all-pages.md) parameters, and continues emitting [PagedResult](../-paged-result/index.md)s, for as long as subscribed to, for subsequent calls to [previous](previous.md), [next](next.md), [loadSinglePage](load-single-page.md), or any of their variants. |
| [loadPages](load-pages.md) | [common]<br>open override fun [loadPages](load-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): Flow<[PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>><br>Retrieves a Flow of [PagedResult](../-paged-result/index.md)s starting with any previously loaded [PagedResult](../-paged-result/index.md)s, followed by the [PagedResult](../-paged-result/index.md) retrieved using the [count](load-pages.md), [key](load-pages.md), and [direction](load-pages.md) parameters, and continues emitting [PagedResult](../-paged-result/index.md)s, for as long as subscribed to, for subsequent calls to [previous](previous.md), [next](next.md), [loadSinglePage](load-single-page.md), or any of their variants. |
| [loadSinglePage](load-single-page.md) | [common]<br>open suspend override fun [loadSinglePage](load-single-page.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)><br>Retrieves a [PagedResult](../-paged-result/index.md) using the provided [count](load-single-page.md), [key](load-single-page.md), and [direction](load-single-page.md) values, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there are no more pages in the provided [direction](load-single-page.md). |
| [next](next.md) | [common]<br>open suspend override fun [next](next.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)><br>Retrieves the next [PagedResult](../-paged-result/index.md) from the [currentPage](current-page.md) using the provided [count](next.md) value, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there is no next page. |
| [previous](previous.md) | [common]<br>open suspend override fun [previous](previous.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)><br>Retrieves the previous [PagedResult](../-paged-result/index.md) from the [currentPage](current-page.md) using the provided [count](previous.md) value, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there is no previous page. |
| [reset](reset.md) | [common]<br>open suspend override fun [reset](reset.md)()<br>Resets this stateful repository back to it's original state before calling any of the functions to load data. |

## Properties

| Name | Summary |
|---|---|
| [currentPage](current-page.md) | [common]<br>open override var [currentPage](current-page.md): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>? = null<br>The current, or last loaded, data set section. |
