//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PaginateRepository](index.md)/[next](next.md)

# next

[common]\
abstract suspend fun [next](next.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DEFAULT_LOAD_COUNT): [PagedResult](../-paged-result/index.md)&lt;[K](index.md), [T](index.md)&gt;

Retrieves the next [PagedResult](../-paged-result/index.md) from the [currentPage](current-page.md) using the provided [count](next.md) value, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there is no next page. When the value is retrieved, it will be dispatched to the SharedFlows for all subscribers before being returned.

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](previous.md) |  |

## Parameters

common

| | |
|---|---|
| count | The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT](-companion/-d-e-f-a-u-l-t_-l-o-a-d_-c-o-u-n-t.md). Note that there's no guarantee that [count](next.md) amount of items will be returned. The amount of returned items might be more or less than the provided [count](next.md). |
