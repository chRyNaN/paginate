//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PageOutOfBoundsException](index.md)

# PageOutOfBoundsException

[common]\
class [PageOutOfBoundsException](index.md) : [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html)

A [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) that indicates an attempt to load a page number, from a [PaginateRepository](../-paginate-repository/index.md), that is less than the first page number or greater than the last page number.

## Constructors

| | |
|---|---|
| [PageOutOfBoundsException](-page-out-of-bounds-exception.md) | [common]<br>fun [PageOutOfBoundsException](-page-out-of-bounds-exception.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Creates an instance of the [PageOutOfBoundsException](index.md) with the provided error [message](../../../../paginate-core/com.chrynan.paginate.core/-page-out-of-bounds-exception/[60]init[62].md). |
| [PageOutOfBoundsException](-page-out-of-bounds-exception.md) | [common]<br>fun [PageOutOfBoundsException](-page-out-of-bounds-exception.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), minIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), maxIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Creates an instance of the [PageOutOfBoundsException](index.md) with the provided [index](../../../../paginate-core/com.chrynan.paginate.core/-page-out-of-bounds-exception/[60]init[62].md), [minIndex](../../../../paginate-core/com.chrynan.paginate.core/-page-out-of-bounds-exception/[60]init[62].md), and [maxIndex](../../../../paginate-core/com.chrynan.paginate.core/-page-out-of-bounds-exception/[60]init[62].md) which are used to create an error message. |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [cause](index.md#-654012527%2FProperties%2F-1207083043) | [common]<br>open val [cause](index.md#-654012527%2FProperties%2F-1207083043): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](index.md#1824300659%2FProperties%2F-1207083043) | [common]<br>open val [message](index.md#1824300659%2FProperties%2F-1207083043): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
