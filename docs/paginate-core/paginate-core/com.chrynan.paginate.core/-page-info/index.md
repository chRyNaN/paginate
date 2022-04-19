//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PageInfo](index.md)

# PageInfo

[common]\
data class [PageInfo](index.md)&lt;[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), hasPreviousPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), hasNextPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), firstKey: [K](index.md)?, lastKey: [K](index.md)?)

Represents information about a particular page loaded from a [PaginateRepository](../-paginate-repository/index.md).

## Constructors

| | |
|---|---|
| [PageInfo](-page-info.md) | [common]<br>fun &lt;[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [PageInfo](-page-info.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), hasPreviousPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, hasNextPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, firstKey: [K](index.md)? = null, lastKey: [K](index.md)? = null) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [firstKey](first-key.md) | [common]<br>val [firstKey](first-key.md): [K](index.md)? = null<br>The key value of the first item of this page. This should correspond to the first item in the [PagedResult.items](../-paged-result/items.md) value. This should be null if there are no items on this page. |
| [hasNextPage](has-next-page.md) | [common]<br>val [hasNextPage](has-next-page.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>Indicates whether there is a page after this page. True if there is a page that can be loaded after this page, false otherwise. |
| [hasPreviousPage](has-previous-page.md) | [common]<br>val [hasPreviousPage](has-previous-page.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>Indicates whether there is a page before this page. True if there is a page that can be loaded before this page, false otherwise. |
| [index](--index--.md) | [common]<br>val [index](--index--.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The unique index value indicating the position of this page with respect to other pages. |
| [lastKey](last-key.md) | [common]<br>val [lastKey](last-key.md): [K](index.md)? = null<br>The key value of the last item of this page. This should correspond to the last item in the [PagedResult.items](../-paged-result/items.md) value. This should be null if there are no items on this page. |
