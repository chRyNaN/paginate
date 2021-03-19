//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[previousOrNull](previous-or-null.md)



# previousOrNull  
[common]  
Content  
suspend fun <[K](previous-or-null.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](previous-or-null.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PaginateRepository](-paginate-repository/index.md)<[K](previous-or-null.md), [T](previous-or-null.md)>.[previousOrNull](previous-or-null.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): [PagedResult](-paged-result/index.md)<[K](previous-or-null.md), [T](previous-or-null.md)>?  
More info  


Calls the [PaginateRepository.next](-paginate-repository/next.md) function and returns it's result or null if a [PageOutOfBoundsException](-page-out-of-bounds-exception/index.md) was thrown.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core//previousOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PaginateRepository](-paginate-repository/next.md)| <a name="com.chrynan.paginate.core//previousOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>|
| <a name="com.chrynan.paginate.core//previousOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PageOutOfBoundsException](-page-out-of-bounds-exception/index.md)| <a name="com.chrynan.paginate.core//previousOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>|
  
  



