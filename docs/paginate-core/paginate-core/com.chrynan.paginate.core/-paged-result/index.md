//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PagedResult](index.md)



# PagedResult  
 [common] data class [PagedResult](index.md)<[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>(**info**: [PageInfo](../-page-info/index.md)<[K](index.md)>, **items**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)>)

Represents a result from loading data from a [PaginateRepository](../-paginate-repository/index.md).

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/PagedResult/PagedResult/#com.chrynan.paginate.core.PageInfo[TypeParam(bounds=[kotlin.Any])]#kotlin.collections.List[TypeParam(bounds=[kotlin.Any])]/PointingToDeclaration/"></a>[PagedResult](-paged-result.md)| <a name="com.chrynan.paginate.core/PagedResult/PagedResult/#com.chrynan.paginate.core.PageInfo[TypeParam(bounds=[kotlin.Any])]#kotlin.collections.List[TypeParam(bounds=[kotlin.Any])]/PointingToDeclaration/"></a> [common] fun <[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PagedResult](-paged-result.md)(info: [PageInfo](../-page-info/index.md)<[K](index.md)>, items: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)> = emptyList())   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/PagedResult.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.paginate.core/PagedResult.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/PagedResult/info/#/PointingToDeclaration/"></a>[info](info.md)| <a name="com.chrynan.paginate.core/PagedResult/info/#/PointingToDeclaration/"></a> [common] val [info](info.md): [PageInfo](../-page-info/index.md)<[K](index.md)>The [PageInfo](../-page-info/index.md) for the resulting loaded page.   <br>|
| <a name="com.chrynan.paginate.core/PagedResult/items/#/PointingToDeclaration/"></a>[items](items.md)| <a name="com.chrynan.paginate.core/PagedResult/items/#/PointingToDeclaration/"></a> [common] val [items](items.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](index.md)>The [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [T](index.md) items for the resulting loaded page.   <br>|

