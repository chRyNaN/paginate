//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[loadAllPagesItems](load-all-pages-items.md)

# loadAllPagesItems

[common]\
fun &lt;[K](load-all-pages-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](load-all-pages-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [PaginateRepository](-paginate-repository/index.md)&lt;[K](load-all-pages-items.md), [T](load-all-pages-items.md)&gt;.[loadAllPagesItems](load-all-pages-items.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT, key: [K](load-all-pages-items.md)? = null, direction: [PageDirection](-page-direction/index.md) = PageDirection.AFTER): Flow&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](load-all-pages-items.md)&gt;&gt;

A convenience function for calling [PaginateRepository.loadAllPages](-paginate-repository/load-all-pages.md) but instead of returning a Flow of a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [PagedResult](-paged-result/index.md)s, it returns a Flow of a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of the [T](load-all-pages-items.md) items from the [PagedResult.items](-paged-result/items.md) property.

## See also

common

| | |
|---|---|
| [com.chrynan.paginate.core.PaginateRepository](-paginate-repository/load-all-pages.md) |  |
| [com.chrynan.paginate.core.PagedResult](-paged-result/items.md) |  |
