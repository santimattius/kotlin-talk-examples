package concurrency.contexts

import concurrency.suspended.AuthenticationService
import concurrency.suspended.FriendsService

fun main() {
    val authenticationService = AuthenticationService()
    val friendsService = FriendsService()

}