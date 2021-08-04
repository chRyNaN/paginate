//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PagedResult](index.md)

# PagedResult

[common]\
data class [PagedResult](index.md)<[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>(**info**: [PageInfo](../-page-info/index.md)<[K](index.md)>, **items**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)>)

Represents a result from loading data from a [PaginateRepository](../-paginate-repository/index.md).

## Constructors

| | |
|---|---|
| [PagedResult](-paged-result.md) | [common]<br>fun <[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PagedResult](-paged-result.md)(info: [PageInfo](../-page-info/index.md)<[K](index.md)>, items: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)> = emptyList()) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [info](info.md) | [common]<br>val [info](info.md): [PageInfo](../-page-info/index.md)<[K](index.md)><br>The [PageInfo](../-page-info/index.md) for the resulting loaded page. |
| [items](items.md) | [common]<br>val [items](items.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)><br>The [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [T](index.md) items for the resulting loaded page. |
