//[paginate-core](../../../index.md)/[com.chrynan.paginate.core](../index.md)/[PaginateRepository](index.md)/[reset](reset.md)

# reset

[common]\
abstract suspend fun [reset](reset.md)()

Resets this stateful repository back to it's original state before calling any of the functions to load data. Effectively clearing all the currently stored pages and emitting empty values to all the SharedFlows.
