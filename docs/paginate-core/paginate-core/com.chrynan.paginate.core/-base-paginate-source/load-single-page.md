//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[BasePaginateSource](index.md)/[loadSinglePage](load-single-page.md)

# loadSinglePage

[common]\
open suspend override fun [loadSinglePage](load-single-page.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): [PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;

Retrieves a [PagedResult](../-paged-result/index.md) using the provided [count](load-single-page.md), [key](load-single-page.md), and [direction](load-single-page.md) values, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there are no more pages in the provided [direction](load-single-page.md). When the value is retrieved, it will be dispatched to the SharedFlows for all subscribers before being returned.

## Parameters

common

| | |
|---|---|
| count | The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT](../-paginate-repository/-companion/-d-e-f-a-u-l-t_-l-o-a-d_-c-o-u-n-t.md). Note that there's no guarantee that [count](load-single-page.md) amount of items will be returned. The amount of returned items might be more or less than the provided [count](load-single-page.md). |
| key | The optional identifier value of the last loaded item, used as a reference to load items before or after that item in the underlying data set. |
| direction | The direction to load more items with respect to [key](load-single-page.md). For instance, [PageDirection.AFTER](../-page-direction/-a-f-t-e-r/index.md) will load items after the item with the [key](load-single-page.md). |
