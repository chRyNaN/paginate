//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[BasePaginateSource](index.md)/[fetch](fetch.md)



# fetch  
[common]  
Content  
abstract suspend fun [fetch](fetch.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md), currentPageCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>  
More info  


Retrieves the [PagedResult](../-paged-result/index.md) using the provided [count](fetch.md), [key](fetch.md), [direction](fetch.md), and [currentPageCount](fetch.md) parameters. This abstract function must be implemented by subclasses and connects the underlying data source with this [PaginateRepository](../-paginate-repository/index.md). For instance, a subclass might provide an implementation of this function that loads the data from a REST API using some HTTP Client.



Note that it is up to the implementation of this function to provide a [PagedResult](../-paged-result/index.md) wrapper around the resulting [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of items. This requires the implementation to create a [PageInfo](../-page-info/index.md) class. The [PageInfo.index](../-page-info/--index--.md) value needs to be unique and ordered for each page for this class to work correctly. One way to create an index would be to use the [currentPageCount](fetch.md) parameter. Note, however, it is possible for pages to be skipped by providing a [key](fetch.md) from a further page. It is up to the implementation to handle this functionality if desired. Handling that scenario might be possible using [currentPageCount](fetch.md) and [currentPage](current-page.md), along with possibly ignoring the desired [count](fetch.md) value and using a fixed value instead.



Note that it's possible for more data to be available over time, for instance, the first page is loaded but newer items are added "before" the first page. For this scenario, the implementation could either use negative [PageInfo.index](../-page-info/--index--.md) values or wait until either the [PaginateRepository.reset](../-paginate-repository/reset.md) or one of the refresh extension functions is called.



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a>count| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a><br><br>The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT](../-paginate-repository/-companion/-d-e-f-a-u-l-t_-l-o-a-d_-c-o-u-n-t.md). Note that there's no guarantee that [count](fetch.md) amount of items will be returned. The amount of returned items might be more or less than the provided [count](fetch.md).<br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a>key| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a><br><br>The optional identifier value of the last loaded item, used as a reference to load items before or after that item in the underlying data set.<br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a>direction| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a><br><br>The direction to load more items with respect to [key](fetch.md). For instance, [PageDirection.AFTER](../-page-direction/-a-f-t-e-r/index.md) will load items after the item with the [key](fetch.md).<br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a>currentPageCount| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a><br><br>The amount of pages already loaded for this [PaginateRepository](../-paginate-repository/index.md).<br><br>|
  
  



