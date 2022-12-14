package concurrency.scopes

import concurrency.suspended.AuthenticationService
import concurrency.suspended.FriendsService


fun main() {
    val authenticationService = AuthenticationService()
    val friendsService = FriendsService()

}