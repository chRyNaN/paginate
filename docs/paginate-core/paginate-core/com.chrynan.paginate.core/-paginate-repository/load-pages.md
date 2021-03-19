//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PaginateRepository](index.md)/[loadPages](load-pages.md)



# loadPages  
[common]  
Content  
abstract fun [loadPages](load-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DEFAULT_LOAD_COUNT, key: [K](index.md)? = null, direction: [PageDirection](../-page-direction/index.md) = PageDirection.AFTER): Flow<[PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>>  
More info  


Retrieves a Flow of [PagedResult](../-paged-result/index.md)s starting with any previously loaded [PagedResult](../-paged-result/index.md)s, followed by the [PagedResult](../-paged-result/index.md) retrieved using the [count](load-pages.md), [key](load-pages.md), and [direction](load-pages.md) parameters, and continues emitting [PagedResult](../-paged-result/index.md)s, for as long as subscribed to, for subsequent calls to [previous](previous.md), [next](next.md), [loadSinglePage](load-single-page.md), or any of their variants.



Note that this function is similar to the [loadAllPages](load-all-pages.md) function but instead of returning a Flow that just emits a single [PagedResult](../-paged-result/index.md) each time a new page is retrieved, the [loadAllPages](load-all-pages.md) function emits a list of all of the [PagedResult](../-paged-result/index.md)s retrieved each time a new page is retrieved.



Note that this returns a Hot Shared Flow. That means the Flows returned from subsequent calls to this function share an upstream SharedFlow, and that the last emitted values are retained between calls to this function until the [reset](reset.md) function is called.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/PaginateRepository/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[com.chrynan.paginate.core.PaginateRepository](load-all-pages.md)| <a name="com.chrynan.paginate.core/PaginateRepository/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/PaginateRepository/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>count| <a name="com.chrynan.paginate.core/PaginateRepository/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a><br><br>The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT](-companion/-d-e-f-a-u-l-t_-l-o-a-d_-c-o-u-n-t.md). Note that there's no guarantee that [count](load-pages.md) amount of items will be returned. The amount of returned items might be more or less than the provided [count](load-pages.md).<br><br>|
| <a name="com.chrynan.paginate.core/PaginateRepository/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>key| <a name="com.chrynan.paginate.core/PaginateRepository/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a><br><br>The optional identifier value of the last loaded item, used as a reference to load items before or after that item in the underlying data set.<br><br>|
| <a name="com.chrynan.paginate.core/PaginateRepository/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>direction| <a name="com.chrynan.paginate.core/PaginateRepository/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a><br><br>The direction to load more items with respect to [key](load-pages.md). For instance, [PageDirection.AFTER](../-page-direction/-a-f-t-e-r/index.md) will load items after the item with the [key](load-pages.md).<br><br>|
  
  



