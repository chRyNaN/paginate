//[paginate-core](../../index.md)/[com.chrynan.paginate.core](../index.md)/[PageInfo](index.md)



# PageInfo  
 [common] data class [PageInfo](index.md)<[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>(**index**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **hasPreviousPage**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **hasNextPage**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **firstKey**: [K](index.md)?, **lastKey**: [K](index.md)?)

Represents information about a particular page loaded from a [PaginateRepository](../-paginate-repository/index.md).

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PageInfo/PageInfo/#kotlin.Int#kotlin.Boolean#kotlin.Boolean#TypeParam(bounds=[kotlin.Any])?#TypeParam(bounds=[kotlin.Any])?/PointingToDeclaration/"></a>[PageInfo](-page-info.md)| <a name="com.chrynan.paginate.core/PageInfo/PageInfo/#kotlin.Int#kotlin.Boolean#kotlin.Boolean#TypeParam(bounds=[kotlin.Any])?#TypeParam(bounds=[kotlin.Any])?/PointingToDeclaration/"></a> [common] fun <[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PageInfo](-page-info.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), hasPreviousPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, hasNextPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, firstKey: [K](index.md)? = null, lastKey: [K](index.md)? = null)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PageInfo/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.chrynan.paginate.core/PageInfo/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component1](component1.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.chrynan.paginate.core/PageInfo/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.chrynan.paginate.core/PageInfo/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component2](component2.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.chrynan.paginate.core/PageInfo/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.chrynan.paginate.core/PageInfo/component3/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component3](component3.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.chrynan.paginate.core/PageInfo/component4/#/PointingToDeclaration/"></a>[component4](component4.md)| <a name="com.chrynan.paginate.core/PageInfo/component4/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component4](component4.md)(): [K](index.md)?  <br><br><br>
| <a name="com.chrynan.paginate.core/PageInfo/component5/#/PointingToDeclaration/"></a>[component5](component5.md)| <a name="com.chrynan.paginate.core/PageInfo/component5/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component5](component5.md)(): [K](index.md)?  <br><br><br>
| <a name="com.chrynan.paginate.core/PageInfo/copy/#kotlin.Int#kotlin.Boolean#kotlin.Boolean#TypeParam(bounds=[kotlin.Any])?#TypeParam(bounds=[kotlin.Any])?/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.chrynan.paginate.core/PageInfo/copy/#kotlin.Int#kotlin.Boolean#kotlin.Boolean#TypeParam(bounds=[kotlin.Any])?#TypeParam(bounds=[kotlin.Any])?/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [copy](copy.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), hasPreviousPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, hasNextPage: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, firstKey: [K](index.md)? = null, lastKey: [K](index.md)? = null): [PageInfo](index.md)<[K](index.md)>  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PageInfo/firstKey/#/PointingToDeclaration/"></a>[firstKey](first-key.md)| <a name="com.chrynan.paginate.core/PageInfo/firstKey/#/PointingToDeclaration/"></a> [common] val [firstKey](first-key.md): [K](index.md)? = nullThe key value of the first item of this page.   <br>
| <a name="com.chrynan.paginate.core/PageInfo/hasNextPage/#/PointingToDeclaration/"></a>[hasNextPage](has-next-page.md)| <a name="com.chrynan.paginate.core/PageInfo/hasNextPage/#/PointingToDeclaration/"></a> [common] val [hasNextPage](has-next-page.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = falseIndicates whether there is a page after this page.   <br>
| <a name="com.chrynan.paginate.core/PageInfo/hasPreviousPage/#/PointingToDeclaration/"></a>[hasPreviousPage](has-previous-page.md)| <a name="com.chrynan.paginate.core/PageInfo/hasPreviousPage/#/PointingToDeclaration/"></a> [common] val [hasPreviousPage](has-previous-page.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = falseIndicates whether there is a page before this page.   <br>
| <a name="com.chrynan.paginate.core/PageInfo/index/#/PointingToDeclaration/"></a>[index](--index--.md)| <a name="com.chrynan.paginate.core/PageInfo/index/#/PointingToDeclaration/"></a> [common] val [index](--index--.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The unique index value indicating the position of this page with respect to other pages.   <br>
| <a name="com.chrynan.paginate.core/PageInfo/lastKey/#/PointingToDeclaration/"></a>[lastKey](last-key.md)| <a name="com.chrynan.paginate.core/PageInfo/lastKey/#/PointingToDeclaration/"></a> [common] val [lastKey](last-key.md): [K](index.md)? = nullThe key value of the last item of this page.   <br>

