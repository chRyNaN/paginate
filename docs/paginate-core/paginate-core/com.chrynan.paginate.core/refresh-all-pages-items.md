//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[refreshAllPagesItems](refresh-all-pages-items.md)

# refreshAllPagesItems

[common]\
fun &lt;[K](refresh-all-pages-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](refresh-all-pages-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [PaginateRepository](-paginate-repository/index.md)&lt;[K](refresh-all-pages-items.md), [T](refresh-all-pages-items.md)&gt;.[refreshAllPagesItems](refresh-all-pages-items.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): Flow&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](refresh-all-pages-items.md)&gt;&gt;

Refreshes the data in this [PaginateRepository](-paginate-repository/index.md) by calling [PaginateRepository.reset](-paginate-repository/reset.md) and then returning [PaginateRepository.loadAllPagesItems](load-all-pages-items.md).

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](-paginate-repository/reset.md) |  |
| [PaginateRepository.loadAllPagesItems](load-all-pages-items.md) |  |
