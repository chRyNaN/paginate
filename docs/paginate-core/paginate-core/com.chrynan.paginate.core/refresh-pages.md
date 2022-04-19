//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[refreshPages](refresh-pages.md)

# refreshPages

[common]\
fun &lt;[K](refresh-pages.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](refresh-pages.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [PaginateRepository](-paginate-repository/index.md)&lt;[K](refresh-pages.md), [T](refresh-pages.md)&gt;.[refreshPages](refresh-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): Flow&lt;[PagedResult](-paged-result/index.md)&lt;[K](refresh-pages.md), [T](refresh-pages.md)&gt;&gt;

Refreshes the data in this [PaginateRepository](-paginate-repository/index.md) by calling [PaginateRepository.reset](-paginate-repository/reset.md) and then returning [PaginateRepository.loadPages](-paginate-repository/load-pages.md).

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](-paginate-repository/load-pages.md) |  |
