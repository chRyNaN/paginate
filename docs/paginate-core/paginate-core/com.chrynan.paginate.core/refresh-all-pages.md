//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[refreshAllPages](refresh-all-pages.md)

# refreshAllPages

[common]\
fun <[K](refresh-all-pages.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](refresh-all-pages.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PaginateRepository](-paginate-repository/index.md)<[K](refresh-all-pages.md), [T](refresh-all-pages.md)>.[refreshAllPages](refresh-all-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[PagedResult](-paged-result/index.md)<[K](refresh-all-pages.md), [T](refresh-all-pages.md)>>>

Refreshes the data in this [PaginateRepository](-paginate-repository/index.md) by calling [PaginateRepository.reset](-paginate-repository/reset.md) and then returning [PaginateRepository.loadAllPages](-paginate-repository/load-all-pages.md).

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](-paginate-repository/load-all-pages.md) |  |
