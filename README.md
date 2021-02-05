# paginate

A Kotlin Multi-platform pagination repository abstraction library. <br>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/paginate">
<a href="https://bintray.com/chrynan/chrynan/paginate/0.1.0/link"><img src="https://api.bintray.com/packages/chrynan/chrynan/paginate/images/download.svg?version=0.1.0"/></a>

## Using the library

* First, simply create a `PaginateRepository` implementation for your data object. The easiest way to create
  a `PaginateRepository` is to extend from `BasePaginateSource`.

```kotlin
data class User(
    val id: String,
    val name: String,
    val created: DateTimeString
)

class UserPaginateRepository @Inject constructor(private val api: UserApi) : BasePaginateSource<User, String>() {

    override suspend fun fetch(
        count: Int,
        key: String?,
        direction: PageDirection,
        currentPageCount: Int
    ): PagedResult<User, String> {
        val users = if (direction == PageDirection.AFTER) {
            api.loadUsers(after = key, count = count)
        } else {
            api.loadUsers(before = key, count = count)
        }

        val pageInfo = PageInfo(
            index = currentPageCount,
            hasPreviousPage = false,
            hasNextPage = true,
            firstKey = users.firstOrNull().id,
            lastKey = users.firstOrNull().id
        )

        return PagedResult(
            info = pageInfo,
            items = users
        )
    }
}
```

* Then, use the created repository to load and paginate the data.

```kotlin
// Subscribe to loaded pages, starting by loading the initial page.
userPaginateRepository.loadPages()
    .onEach {
        // Do something with the emitted PagedResult objects
    }
    .catch { ... }
    .launchIn(this)

// Suspending function to load the next page. Will dispatch to the above Flow and return the PagedResult.
val nextPage = userPaginateRepository.next()

// Suspending function to load the previous page. Will dispatch to the above Flow and return the PagedResult.
val previousPage = userPaginateRepository.previous()
```

## Building the library

The library is provided through [Bintray](https://bintray.com/). Checkout
the [releases page](https://github.com/chRyNaN/paginate/releases) to get the latest version.

### Repository

```groovy
repositories {
    maven {
        url = uri("https://dl.bintray.com/chrynan/chrynan")
    }
}
```

### Dependency

```groovy
implementation "com.chrynan.paginate:paginate-core:$VERSION"
```

## Documentation

Markdown Documentation is available in the [docs](/docs) folder.

## License

```
Copyright 2020 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
