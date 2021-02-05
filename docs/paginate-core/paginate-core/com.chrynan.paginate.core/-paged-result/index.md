//[paginate-core](../../index.md)/[com.chrynan.paginate.core](../index.md)/[PagedResult](index.md)



# PagedResult  
 [common] data class [PagedResult](index.md)<[T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>(**info**: [PageInfo](../-page-info/index.md)<[K](index.md)>, **items**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)>)

Represents a result from loading data from a [PaginateRepository](../-paginate-repository/index.md).

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PagedResult/PagedResult/#com.chrynan.paginate.core.PageInfo[TypeParam(bounds=[kotlin.Any])]#kotlin.collections.List[TypeParam(bounds=[kotlin.Any])]/PointingToDeclaration/"></a>[PagedResult](-paged-result.md)| <a name="com.chrynan.paginate.core/PagedResult/PagedResult/#com.chrynan.paginate.core.PageInfo[TypeParam(bounds=[kotlin.Any])]#kotlin.collections.List[TypeParam(bounds=[kotlin.Any])]/PointingToDeclaration/"></a> [common] fun <[T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PagedResult](-paged-result.md)(info: [PageInfo](../-page-info/index.md)<[K](index.md)>, items: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)> = emptyList())   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PagedResult/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.chrynan.paginate.core/PagedResult/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component1](component1.md)(): [PageInfo](../-page-info/index.md)<[K](index.md)>  <br><br><br>
| <a name="com.chrynan.paginate.core/PagedResult/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.chrynan.paginate.core/PagedResult/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component2](component2.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)>  <br><br><br>
| <a name="com.chrynan.paginate.core/PagedResult/copy/#com.chrynan.paginate.core.PageInfo[TypeParam(bounds=[kotlin.Any])]#kotlin.collections.List[TypeParam(bounds=[kotlin.Any])]/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.chrynan.paginate.core/PagedResult/copy/#com.chrynan.paginate.core.PageInfo[TypeParam(bounds=[kotlin.Any])]#kotlin.collections.List[TypeParam(bounds=[kotlin.Any])]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [copy](copy.md)(info: [PageInfo](../-page-info/index.md)<[K](index.md)>, items: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)> = emptyList()): [PagedResult](index.md)<[T](index.md), [K](index.md)>  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PagedResult/info/#/PointingToDeclaration/"></a>[info](info.md)| <a name="com.chrynan.paginate.core/PagedResult/info/#/PointingToDeclaration/"></a> [common] val [info](info.md): [PageInfo](../-page-info/index.md)<[K](index.md)>The [PageInfo](../-page-info/index.md) for the resulting loaded page.   <br>
| <a name="com.chrynan.paginate.core/PagedResult/items/#/PointingToDeclaration/"></a>[items](items.md)| <a name="com.chrynan.paginate.core/PagedResult/items/#/PointingToDeclaration/"></a> [common] val [items](items.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)>The [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [T](index.md) items for the resulting loaded page.   <br>

