package concurrency.builders

import concurrency.suspended.AuthenticationService
import concurrency.suspended.FriendsService
import concurrency.suspended.SearchResult
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val authenticationService = AuthenticationService()
    val friendsService = FriendsService()

    //run blocking
    runBlocking {
        val user = authenticationService.login("my_user", "my_password")
        val friends = friendsService.currents(user)
        var searchResult = SearchResult(user, friends)
    }

    //launch builder
    val job = GlobalScope.launch {
        println("start coroutine")
        val user = authenticationService.login("my_user", "my_password")
        val friends = friendsService.currents(user)
        val searchResult = SearchResult(user, friends)
        println("Result: $searchResult")
    }

//    job.join(): espera a que la coroutina termine antes de seguir con el resto
    job.cancel()// cancela las coroutine asociadas al job

    //async builder
    GlobalScope.launch {
        println("start coroutine")
        val user = authenticationService.login("my_user", "my_password")
        val friends = async { friendsService.currents(user) }
        val suggested = async { friendsService.suggestions(user) }

        val searchResult = SearchResult(user, friends.await(), suggested.await())
        println("Result: $searchResult")
    }
}