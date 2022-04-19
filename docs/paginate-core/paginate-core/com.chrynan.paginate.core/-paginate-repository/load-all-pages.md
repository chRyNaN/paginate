//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PaginateRepository](index.md)/[loadAllPages](load-all-pages.md)

# loadAllPages

[common]\
abstract fun [loadAllPages](load-all-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DEFAULT_LOAD_COUNT, key: [K](index.md)? = null, direction: [PageDirection](../-page-direction/index.md) = PageDirection.AFTER): Flow&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;&gt;&gt;

Retrieves a Flow of a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [PagedResult](../-paged-result/index.md)s starting with any previously loaded [PagedResult](../-paged-result/index.md)s, followed by the [PagedResult](../-paged-result/index.md) retrieved using the [count](load-all-pages.md), [key](load-all-pages.md), and [direction](load-all-pages.md) parameters, and continues emitting [PagedResult](../-paged-result/index.md)s, for as long as subscribed to, for subsequent calls to [previous](previous.md), [next](next.md), [loadSinglePage](load-single-page.md), or any of their variants.

Note that this function is similar to the [loadPages](load-pages.md) function but instead of returning a Flow that just emits a single [PagedResult](../-paged-result/index.md) each time a new page is retrieved, this [loadAllPages](load-all-pages.md) function emits a list of all of the [PagedResult](../-paged-result/index.md)s retrieved each time a new page is retrieved.

Note that this returns a Hot Shared Flow. That means the Flows returned from subsequent calls to this function share an upstream SharedFlow, and that the last emitted values are retained between calls to this function until the [reset](reset.md) function is called.

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](load-pages.md) |  |

## Parameters

common

| | |
|---|---|
| count | The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT](-companion/-d-e-f-a-u-l-t_-l-o-a-d_-c-o-u-n-t.md). Note that there's no guarantee that [count](load-all-pages.md) amount of items will be returned. The amount of returned items might be more or less than the provided [count](load-all-pages.md). |
| key | The optional identifier value of the last loaded item, used as a reference to load items before or after that item in the underlying data set. |
| direction | The direction to load more items with respect to [key](load-all-pages.md). For instance, [PageDirection.AFTER](../-page-direction/-a-f-t-e-r/index.md) will load items after the item with the [key](load-all-pages.md). |
