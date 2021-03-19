//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PageInfo](index.md)



# PageInfo  
 [common] data class [PageInfo](index.md)<[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>(**index**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **hasPreviousPage**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **hasNextPage**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **firstKey**: [K](index.md)?, **lastKey**: [K](index.md)?)

Represents information about a particular page loaded from a [PaginateRepository](../-paginate-repository/index.md).

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/PageInfo/PageInfo/#kotlin.Int#kotlin.Boolean#kotlin.Boolean#TypeParam(bounds=[kotlin.Any])?#TypeParam(bounds=[kotlin.Any])?/PointingToDeclaration/"></a>[PageInfo](-page-info.md)| <a name="com.chrynan.paginate.core/PageInfo/PageInfo/#kotlin.Int#kotlin.Boolean#kotlin.Boolean#TypeParam(bounds=[kotlin.Any])?#TypeParam(bounds=[kotlin.Any])?/PointingToDeclaration/"></a> [common] fun <[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PageInfo](-page-info.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), hasPreviousPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, hasNextPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, firstKey: [K](index.md)? = null, lastKey: [K](index.md)? = null)   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/PageInfo.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.paginate.core/PageInfo.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/PageInfo/firstKey/#/PointingToDeclaration/"></a>[firstKey](first-key.md)| <a name="com.chrynan.paginate.core/PageInfo/firstKey/#/PointingToDeclaration/"></a> [common] val [firstKey](first-key.md): [K](index.md)? = nullThe key value of the first item of this page.   <br>|
| <a name="com.chrynan.paginate.core/PageInfo/hasNextPage/#/PointingToDeclaration/"></a>[hasNextPage](has-next-page.md)| <a name="com.chrynan.paginate.core/PageInfo/hasNextPage/#/PointingToDeclaration/"></a> [common] val [hasNextPage](has-next-page.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = falseIndicates whether there is a page after this page.   <br>|
| <a name="com.chrynan.paginate.core/PageInfo/hasPreviousPage/#/PointingToDeclaration/"></a>[hasPreviousPage](has-previous-page.md)| <a name="com.chrynan.paginate.core/PageInfo/hasPreviousPage/#/PointingToDeclaration/"></a> [common] val [hasPreviousPage](has-previous-page.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = falseIndicates whether there is a page before this page.   <br>|
| <a name="com.chrynan.paginate.core/PageInfo/index/#/PointingToDeclaration/"></a>[index](--index--.md)| <a name="com.chrynan.paginate.core/PageInfo/index/#/PointingToDeclaration/"></a> [common] val [index](--index--.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The unique index value indicating the position of this page with respect to other pages.   <br>|
| <a name="com.chrynan.paginate.core/PageInfo/lastKey/#/PointingToDeclaration/"></a>[lastKey](last-key.md)| <a name="com.chrynan.paginate.core/PageInfo/lastKey/#/PointingToDeclaration/"></a> [common] val [lastKey](last-key.md): [K](index.md)? = nullThe key value of the last item of this page.   <br>|

