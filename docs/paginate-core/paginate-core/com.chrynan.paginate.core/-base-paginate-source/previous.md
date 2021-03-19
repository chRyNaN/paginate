//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[BasePaginateSource](index.md)/[previous](previous.md)



# previous  
[common]  
Content  
open suspend override fun [previous](previous.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>  
More info  


Retrieves the previous [PagedResult](../-paged-result/index.md) from the [currentPage](current-page.md) using the provided [count](previous.md) value, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there is no previous page. When the value is retrieved, it will be dispatched to the SharedFlows for all subscribers before being returned.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/BasePaginateSource/previous/#kotlin.Int/PointingToDeclaration/"></a>[com.chrynan.paginate.core.BasePaginateSource](next.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/previous/#kotlin.Int/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/BasePaginateSource/previous/#kotlin.Int/PointingToDeclaration/"></a>count| <a name="com.chrynan.paginate.core/BasePaginateSource/previous/#kotlin.Int/PointingToDeclaration/"></a><br><br>The desired amount of items to load, defaults to [DEFAULT_LOAD_COUNT](../-paginate-repository/-companion/-d-e-f-a-u-l-t_-l-o-a-d_-c-o-u-n-t.md). Note that there's no guarantee that [count](previous.md) amount of items will be returned. The amount of returned items might be more or less than the provided [count](previous.md).<br><br>|
  
  



