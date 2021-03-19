//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[refreshPages](refresh-pages.md)



# refreshPages  
[common]  
Content  
fun <[K](refresh-pages.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](refresh-pages.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PaginateRepository](-paginate-repository/index.md)<[K](refresh-pages.md), [T](refresh-pages.md)>.[refreshPages](refresh-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): Flow<[PagedResult](-paged-result/index.md)<[K](refresh-pages.md), [T](refresh-pages.md)>>  
More info  


Refreshes the data in this [PaginateRepository](-paginate-repository/index.md) by calling [PaginateRepository.reset](-paginate-repository/reset.md) and then returning [PaginateRepository.loadPages](-paginate-repository/load-pages.md).



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core//refreshPages/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PaginateRepository](-paginate-repository/load-pages.md)| <a name="com.chrynan.paginate.core//refreshPages/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>|
  
  



