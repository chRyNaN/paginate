//[paginate-core](../../index.md)/[com.chrynan.paginate.core](index.md)/[loadSinglePageOrNull](load-single-page-or-null.md)



# loadSinglePageOrNull  
[common]  
Content  
suspend fun <[K](load-single-page-or-null.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](load-single-page-or-null.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [PaginateRepository](-paginate-repository/index.md)<[K](load-single-page-or-null.md), [T](load-single-page-or-null.md)>.[loadSinglePageOrNull](load-single-page-or-null.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PaginateRepository.DEFAULT_LOAD_COUNT, key: [K](load-single-page-or-null.md)? = null, direction: [PageDirection](-page-direction/index.md) = PageDirection.AFTER): [PagedResult](-paged-result/index.md)<[K](load-single-page-or-null.md), [T](load-single-page-or-null.md)>?  
More info  


Calls the [PaginateRepository.loadSinglePage](-paginate-repository/load-single-page.md) function and returns it's result or null if a [PageOutOfBoundsException](-page-out-of-bounds-exception/index.md) was thrown.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core//loadSinglePageOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PaginateRepository](-paginate-repository/load-single-page.md)| <a name="com.chrynan.paginate.core//loadSinglePageOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>|
| <a name="com.chrynan.paginate.core//loadSinglePageOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PageOutOfBoundsException](-page-out-of-bounds-exception/index.md)| <a name="com.chrynan.paginate.core//loadSinglePageOrNull/com.chrynan.paginate.core.PaginateRepository[TypeParam(bounds=[kotlin.Any]),TypeParam(bounds=[kotlin.Any])]#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>|
  
  



