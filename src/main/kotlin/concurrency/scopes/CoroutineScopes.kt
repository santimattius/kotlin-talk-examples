package concurrency.scopes

import concurrency.suspended.AuthenticationService
import concurrency.suspended.FriendsService
import concurrency.suspended.SearchResult
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.job
import kotlinx.coroutines.launch


fun main() {
    val authenticationService = AuthenticationService()
    val friendsService = FriendsService()

    //STEP: 01
//    val scope = object : CoroutineScope {
//
//        //        val job = Job()
//        val job = SupervisorJob()
//        override val coroutineContext: CoroutineContext
//            get() = Dispatchers.Main + job
//
//    }

    val scope = MainScope()

    scope.launch {
        println("start coroutine")
        val user = authenticationService.login("my_user", "my_password")
        val friends = friendsService.currents(user)
        val searchResult = SearchResult(user, friends)
        println("Result: $searchResult")
    }

//    scope.job.cancel()
    scope.coroutineContext.job.cancel()
}