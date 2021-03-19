//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[nextOrNull](next-or-null.md)



# nextOrNull  
[common]  
Content  
suspend fun <[K](next-or-null.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](next-or-null.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PaginateRepository](-paginate-repository/index.md)<[K](next-or-null.md), [T](next-or-null.md)>.[nextOrNull](next-or-null.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT): [PagedResult](-paged-result/index.md)<[K](next-or-null.md), [T](next-or-null.md)>?  
More info  


Calls the [PaginateRepository.previous](-paginate-repository/previous.md) function and returns it's result or null if a [PageOutOfBoundsException](-page-out-of-bounds-exception/index.md) was thrown.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core//nextOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PaginateRepository](-paginate-repository/previous.md)| <a name="com.chrynan.paginate.core//nextOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>|
| <a name="com.chrynan.paginate.core//nextOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PageOutOfBoundsException](-page-out-of-bounds-exception/index.md)| <a name="com.chrynan.paginate.core//nextOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int/PointingToDeclaration/"></a>|
  
  



