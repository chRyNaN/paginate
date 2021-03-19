//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[BasePaginateSource](index.md)



# BasePaginateSource  
 [common] abstract class [BasePaginateSource](index.md)<[K](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> : [PaginateRepository](../-paginate-repository/index.md)<[K](index.md), [T](index.md)> 

A base implementation of the [PaginateRepository](../-paginate-repository/index.md) interface. This abstract class provides most of the implementation of the [PaginateRepository](../-paginate-repository/index.md) interface leaving only the [fetch](fetch.md) function to be implemented by subclasses.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.paginate.core/BasePaginateSource/BasePaginateSource/#/PointingToDeclaration/"></a>[BasePaginateSource](-base-paginate-source.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/BasePaginateSource/#/PointingToDeclaration/"></a> [common] fun [BasePaginateSource](-base-paginate-source.md)()   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/BasePaginateSource.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.paginate.core/BasePaginateSource.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a>[fetch](fetch.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/fetch/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [fetch](fetch.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md), currentPageCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>  <br>More info  <br>Retrieves the [PagedResult](../-paged-result/index.md) using the provided [count](fetch.md), [key](fetch.md), [direction](fetch.md), and [currentPageCount](fetch.md) parameters.  <br><br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/loadAllPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[loadAllPages](load-all-pages.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/loadAllPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [loadAllPages](load-all-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): Flow<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>>>  <br>More info  <br>Retrieves a Flow of a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [PagedResult](../-paged-result/index.md)s starting with any previously loaded [PagedResult](../-paged-result/index.md)s, followed by the [PagedResult](../-paged-result/index.md) retrieved using the [count](load-all-pages.md), [key](load-all-pages.md), and [direction](load-all-pages.md) parameters, and continues emitting [PagedResult](../-paged-result/index.md)s, for as long as subscribed to, for subsequent calls to [previous](previous.md), [next](next.md), [loadSinglePage](load-single-page.md), or any of their variants.  <br><br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[loadPages](load-pages.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/loadPages/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [loadPages](load-pages.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): Flow<[PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>>  <br>More info  <br>Retrieves a Flow of [PagedResult](../-paged-result/index.md)s starting with any previously loaded [PagedResult](../-paged-result/index.md)s, followed by the [PagedResult](../-paged-result/index.md) retrieved using the [count](load-pages.md), [key](load-pages.md), and [direction](load-pages.md) parameters, and continues emitting [PagedResult](../-paged-result/index.md)s, for as long as subscribed to, for subsequent calls to [previous](previous.md), [next](next.md), [loadSinglePage](load-single-page.md), or any of their variants.  <br><br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/loadSinglePage/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[loadSinglePage](load-single-page.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/loadSinglePage/#kotlin.Int#TypeParam(bounds=[kotlin.Any])?#com.chrynan.paginate.core.PageDirection/PointingToDeclaration/"></a>[common]  <br>Content  <br>open suspend override fun [loadSinglePage](load-single-page.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), key: [K](index.md)?, direction: [PageDirection](../-page-direction/index.md)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>  <br>More info  <br>Retrieves a [PagedResult](../-paged-result/index.md) using the provided [count](load-single-page.md), [key](load-single-page.md), and [direction](load-single-page.md) values, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there are no more pages in the provided [direction](load-single-page.md).  <br><br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/next/#kotlin.Int/PointingToDeclaration/"></a>[next](next.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/next/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>open suspend override fun [next](next.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>  <br>More info  <br>Retrieves the next [PagedResult](../-paged-result/index.md) from the [currentPage](current-page.md) using the provided [count](next.md) value, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there is no next page.  <br><br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/previous/#kotlin.Int/PointingToDeclaration/"></a>[previous](previous.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/previous/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>open suspend override fun [previous](previous.md)(count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>  <br>More info  <br>Retrieves the previous [PagedResult](../-paged-result/index.md) from the [currentPage](current-page.md) using the provided [count](previous.md) value, or throws a [PageOutOfBoundsException](../-page-out-of-bounds-exception/index.md) if there is no previous page.  <br><br><br>|
| <a name="com.chrynan.paginate.core/BasePaginateSource/reset/#/PointingToDeclaration/"></a>[reset](reset.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/reset/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open suspend override fun [reset](reset.md)()  <br>More info  <br>Resets this stateful repository back to it's original state before calling any of the functions to load data.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.paginate.core/BasePaginateSource/currentPage/#/PointingToDeclaration/"></a>[currentPage](current-page.md)| <a name="com.chrynan.paginate.core/BasePaginateSource/currentPage/#/PointingToDeclaration/"></a> [common] open override var [currentPage](current-page.md): [PagedResult](../-paged-result/index.md)<[K](index.md), [T](index.md)>? = nullThe current, or last loaded, data set section.   <br>|

