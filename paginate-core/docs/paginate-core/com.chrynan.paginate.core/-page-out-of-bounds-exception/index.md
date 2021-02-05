//[paginate-core](../../index.md)/[com.chrynan.paginate.core](../index.md)/[PageOutOfBoundsException](index.md)



# PageOutOfBoundsException  
 [common] class [PageOutOfBoundsException](index.md) : [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html)

A [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) that indicates an attempt to load a page number, from a [PaginateRepository](../-paginate-repository/index.md), that is less than the first page number or greater than the last page number.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/PageOutOfBoundsException/#kotlin.String?/PointingToDeclaration/"></a>[PageOutOfBoundsException](-page-out-of-bounds-exception.md)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/PageOutOfBoundsException/#kotlin.String?/PointingToDeclaration/"></a> [common] fun [PageOutOfBoundsException](-page-out-of-bounds-exception.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)Creates an instance of the [PageOutOfBoundsException](index.md) with the provided error [message](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fmessage%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-785684615).   <br>
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/PageOutOfBoundsException/#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[PageOutOfBoundsException](-page-out-of-bounds-exception.md)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/PageOutOfBoundsException/#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a> [common] fun [PageOutOfBoundsException](-page-out-of-bounds-exception.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), minIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), maxIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))Creates an instance of the [PageOutOfBoundsException](index.md) with the provided index, minIndex, and maxIndex which are used to create an error message.   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../-paginate-repository/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-785684615)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/cause/#/PointingToDeclaration/"></a>[cause](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fcause%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-785684615)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/cause/#/PointingToDeclaration/"></a> [common] open val [cause](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fcause%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-785684615): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?   <br>
| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/message/#/PointingToDeclaration/"></a>[message](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fmessage%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-785684615)| <a name="com.chrynan.paginate.core/PageOutOfBoundsException/message/#/PointingToDeclaration/"></a> [common] open val [message](index.md#%5Bcom.chrynan.paginate.core%2FPageOutOfBoundsException%2Fmessage%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-785684615): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>

