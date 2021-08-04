//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[previousOrNull](previous-or-null.md)

# previousOrNull

[common]\
suspend fun <[K](previous-or-null.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](previous-or-null.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PaginateRepository](-paginate-repository/index.md)<[K](previous-or-null.md), [T](previous-or-null.md)>.[previousOrNull](previous-or-null.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): [PagedResult](-paged-result/index.md)<[K](previous-or-null.md), [T](previous-or-null.md)>?

Calls the [PaginateRepository.next](-paginate-repository/next.md) function and returns it's result or null if a [PageOutOfBoundsException](-page-out-of-bounds-exception/index.md) was thrown.

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](-paginate-repository/next.md) |  |
| [com.chrynan.paginate.core.PageOutOfBoundsException](-page-out-of-bounds-exception/index.md) |  |
