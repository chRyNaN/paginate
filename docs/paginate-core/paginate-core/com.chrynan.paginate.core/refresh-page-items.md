//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[refreshPageItems](refresh-page-items.md)

# refreshPageItems

[common]\
fun &lt;[K](refresh-page-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](refresh-page-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [PaginateRepository](-paginate-repository/index.md)&lt;[K](refresh-page-items.md), [T](refresh-page-items.md)&gt;.[refreshPageItems](refresh-page-items.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): Flow&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](refresh-page-items.md)&gt;&gt;

Refreshes the data in this [PaginateRepository](-paginate-repository/index.md) by calling [PaginateRepository.reset](-paginate-repository/reset.md) and then returning [PaginateRepository.loadPageItems](load-page-items.md).

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](-paginate-repository/reset.md) |  |
| [PaginateRepository.loadPageItems](load-page-items.md) |  |
