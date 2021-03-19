//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PageOutOfBoundsException](index.md)



# PageOutOfBoundsException  
 [common] class [PageOutOfBoundsException](index.md) : [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html)

A [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) that indicates an attempt to load a page number, from a [PaginateRepository](../-paginate-repository/index.md), that is less than the first page number or greater than the last page number.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/PageOutOfBoundsException/#kotlin.String?/PointingToDeclaration/"></a>[PageOutOfBoundsException](-page-out-of-bounds-exception.md)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/PageOutOfBoundsException/#kotlin.String?/PointingToDeclaration/"></a> [common] fun [PageOutOfBoundsException](-page-out-of-bounds-exception.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)Creates an instance of the [PageOutOfBoundsException](index.md) with the provided error [message](../../../../paginate-core/com.chrynan.paginate.core/-page-out-of-bounds-exception/[60]init[62].md).   <br>|
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/PageOutOfBoundsException/#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[PageOutOfBoundsException](-page-out-of-bounds-exception.md)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/PageOutOfBoundsException/#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a> [common] fun [PageOutOfBoundsException](-page-out-of-bounds-exception.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), minIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), maxIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))Creates an instance of the [PageOutOfBoundsException](index.md) with the provided [index](../../../../paginate-core/com.chrynan.paginate.core/-page-out-of-bounds-exception/[60]init[62].md), [minIndex](../../../../paginate-core/com.chrynan.paginate.core/-page-out-of-bounds-exception/[60]init[62].md), and [maxIndex](../../../../paginate-core/com.chrynan.paginate.core/-page-out-of-bounds-exception/[60]init[62].md) which are used to create an error message.   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/cause/#/PointingToDeclaration/"></a>[cause](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fcause%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-364132079)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/cause/#/PointingToDeclaration/"></a> [common] open val [cause](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fcause%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-364132079): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?   <br>|
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/message/#/PointingToDeclaration/"></a>[message](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fmessage%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-364132079)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/message/#/PointingToDeclaration/"></a> [common] open val [message](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fmessage%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-364132079): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>|

