//[paginate-core](../../index.md)/[com.chrynan.paginate.core](../index.md)/[PaginateRepository](index.md)/[loadSinglePage](load-single-page.md)



# loadSinglePage  
[common]  
Content  
abstract suspend fun [loadSinglePage](load-single-page.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DEFAULT_LOAD_COUNT, key: [K](index.md)? = null, direction: [PageDirection](../-page-direction/index.md) = PageDirection.AFTER): [PagedResult](../-paged-result/index.md)<[T](index.md), [K](index.md)>  
More info  


Retrieves a [PagedResult](../-paged-result/index.md) using the provided count, key, and direction values, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there are no more pages in the provided direction. When the value is retrieved, it will be dispatched to the SharedFlows for all subscribers before being returned.



## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PaginateRepository/loadSinglePage/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>count| <a name="com.chrynan.paginate.core/PaginateRepository/loadSinglePage/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a><br><br>The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT](-companion/-d-e-f-a-u-l-t_-l-o-a-d_-c-o-u-n-t.md). Note that there's no guarantee that count amount of items will be returned. The amount of returned items might be more or less than the provided count.<br><br>
| <a name="com.chrynan.paginate.core/PaginateRepository/loadSinglePage/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>key| <a name="com.chrynan.paginate.core/PaginateRepository/loadSinglePage/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a><br><br>The optional identifier value of the last loaded item, used as a reference to load items before or after that item in the underlying data set.<br><br>
| <a name="com.chrynan.paginate.core/PaginateRepository/loadSinglePage/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>direction| <a name="com.chrynan.paginate.core/PaginateRepository/loadSinglePage/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a><br><br>The direction to load more items with respect to key. For instance, [PageDirection.AFTER](../-page-direction/-a-f-t-e-r/index.md) will load items after the item with the key.<br><br>
  
  



