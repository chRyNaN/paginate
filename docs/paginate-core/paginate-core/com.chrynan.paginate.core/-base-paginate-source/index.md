//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[BasePaginateSource](index.md)

# BasePaginateSource

[common]\
abstract class [BasePaginateSource](index.md)&lt;[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; : [PaginateRepository](../-paginate-repository/index.md)&lt;[K](index.md), [T](index.md)&gt; 

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
| [fetch](fetch.md) | [common]<br>abstract suspend fun [fetch](fetch.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md), currentPageCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;<br>Retrieves the [PagedResult](../-paged-result/index.md) using the provided [count](fetch.md), [key](fetch.md), [direction](fetch.md), and [currentPageCount](fetch.md) parameters. This abstract function must be implemented by subclasses and connects the underlying data source with this [PaginateRepository](../-paginate-repository/index.md). For instance, a subclass might provide an implementation of this function that loads the data from a REST API using some HTTP Client. |
| [loadAllPages](load-all-pages.md) | [common]<br>open override fun [loadAllPages](load-all-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): Flow&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;&gt;&gt;<br>Retrieves a Flow of a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [PagedResult](../-paged-result/index.md)s starting with any previously loaded [PagedResult](../-paged-result/index.md)s, followed by the [PagedResult](../-paged-result/index.md) retrieved using the [count](load-all-pages.md), [key](load-all-pages.md), and [direction](load-all-pages.md) parameters, and continues emitting [PagedResult](../-paged-result/index.md)s, for as long as subscribed to, for subsequent calls to [previous](previous.md), [next](next.md), [loadSinglePage](load-single-page.md), or any of their variants. |
| [loadPages](load-pages.md) | [common]<br>open override fun [loadPages](load-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): Flow&lt;[PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;&gt;<br>Retrieves a Flow of [PagedResult](../-paged-result/index.md)s starting with any previously loaded [PagedResult](../-paged-result/index.md)s, followed by the [PagedResult](../-paged-result/index.md) retrieved using the [count](load-pages.md), [key](load-pages.md), and [direction](load-pages.md) parameters, and continues emitting [PagedResult](../-paged-result/index.md)s, for as long as subscribed to, for subsequent calls to [previous](previous.md), [next](next.md), [loadSinglePage](load-single-page.md), or any of their variants. |
| [loadSinglePage](load-single-page.md) | [common]<br>open suspend override fun [loadSinglePage](load-single-page.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): [PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;<br>Retrieves a [PagedResult](../-paged-result/index.md) using the provided [count](load-single-page.md), [key](load-single-page.md), and [direction](load-single-page.md) values, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there are no more pages in the provided [direction](load-single-page.md). When the value is retrieved, it will be dispatched to the SharedFlows for all subscribers before being returned. |
| [next](next.md) | [common]<br>open suspend override fun [next](next.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;<br>Retrieves the next [PagedResult](../-paged-result/index.md) from the [currentPage](current-page.md) using the provided [count](next.md) value, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there is no next page. When the value is retrieved, it will be dispatched to the SharedFlows for all subscribers before being returned. |
| [previous](previous.md) | [common]<br>open suspend override fun [previous](previous.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;<br>Retrieves the previous [PagedResult](../-paged-result/index.md) from the [currentPage](current-page.md) using the provided [count](previous.md) value, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there is no previous page. When the value is retrieved, it will be dispatched to the SharedFlows for all subscribers before being returned. |
| [reset](reset.md) | [common]<br>open suspend override fun [reset](reset.md)()<br>Resets this stateful repository back to it's original state before calling any of the functions to load data. Effectively clearing all the currently stored pages and emitting empty values to all the SharedFlows. |

## Properties

| Name | Summary |
|---|---|
| [currentPage](current-page.md) | [common]<br>open override var [currentPage](current-page.md): [PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;? = null<br>The current, or last loaded, data set section. A value of null indicates that there are no pages loaded. |
