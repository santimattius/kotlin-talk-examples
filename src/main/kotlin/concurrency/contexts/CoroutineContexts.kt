package concurrency.contexts

import concurrency.suspended.AuthenticationService
import concurrency.suspended.FriendsService
import concurrency.suspended.SearchResult
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.CoroutineContext

fun main() {
    val authenticationService = AuthenticationService()
    val friendsService = FriendsService()

    runBlocking {
        val context: CoroutineContext = coroutineContext
        val user = authenticationService.login("my_user", "my_password")
        val friends = friendsService.currents(user)
        var searchResult = SearchResult(user, friends)
    }
}