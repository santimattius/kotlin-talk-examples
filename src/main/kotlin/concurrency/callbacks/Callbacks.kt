package concurrency.callbacks

fun main() {
    val authenticationService = AuthenticationService()
    val friendsService = FriendsService()

    authenticationService.login("my_user", "my_password") { user ->
        var searchResult = SearchResult(user)
        friendsService.currents(user) { friends ->
            searchResult = searchResult.copy(friends = friends)
            friendsService.suggestions(user) { suggests ->
                searchResult = searchResult.copy(suggestedFriends = suggests)
            }
        }
    }
}