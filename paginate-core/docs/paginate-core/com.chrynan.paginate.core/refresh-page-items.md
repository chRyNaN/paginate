//[paginate-core](../index.md)/[com.chrynan.paginate.core](index.md)/[refreshPageItems](refresh-page-items.md)



# refreshPageItems  
[common]  
Content  
fun <[T](refresh-page-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [K](refresh-page-items.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PaginateRepository](-paginate-repository/index.md)<[T](refresh-page-items.md), [K](refresh-page-items.md)>.[refreshPageItems](refresh-page-items.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](refresh-page-items.md)>>  
More info  


Refreshes the data in this [PaginateRepository](-paginate-repository/index.md) by calling [PaginateRepository.reset](-paginate-repository/reset.md) and then returning [PaginateRepository.loadPageItems](load-page-items.md).



## See also  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core//refreshPageItems/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PaginateRepository](-paginate-repository/reset.md)| <a name="com.chrynan.paginate.core//refreshPageItems/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>
| <a name="com.chrynan.paginate.core//refreshPageItems/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>[PaginateRepository.loadPageItems](load-page-items.md)| <a name="com.chrynan.paginate.core//refreshPageItems/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>
  
  



