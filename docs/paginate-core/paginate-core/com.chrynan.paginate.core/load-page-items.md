//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[loadPageItems](load-page-items.md)

# loadPageItems

[common]\
fun &lt;[K](load-page-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](load-page-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [PaginateRepository](-paginate-repository/index.md)&lt;[K](load-page-items.md), [T](load-page-items.md)&gt;.[loadPageItems](load-page-items.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT, key: [K](load-page-items.md)? = null, direction: [PageDirection](-page-direction/index.md) = PageDirection.AFTER): Flow&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](load-page-items.md)&gt;&gt;

A convenience function for calling [PaginateRepository.loadPages](-paginate-repository/load-pages.md) but instead of returning a Flow of [PagedResult](-paged-result/index.md)s, it returns a Flow of a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of the [T](load-page-items.md) items from the [PagedResult.items](-paged-result/items.md) property.

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](-paginate-repository/load-pages.md) |  |
| [com.chrynan.paginate.core.PagedResult](-paged-result/items.md) |  |
