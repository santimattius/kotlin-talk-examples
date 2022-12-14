package concurrency.callbacks

import java.util.UUID


data class User(val id: UUID, val name: String)

class AuthenticationService {

    fun login(userName: String, password: String, callback: (User) -> Unit) {
        Thread.sleep(500)
        val user = User(id = UUID.randomUUID(), name = userName)
        callback.invoke(user)
    }
}

class FriendsService {

    fun currents(user: User, callback: (List<User>) -> Unit) {
        Thread.sleep(500)
        val friends = (1..10).map { User(id = UUID.randomUUID(), name = "Friend $it") }
        callback.invoke(friends)
    }

    fun suggestions(user: User, callback: (List<User>) -> Unit) {
        Thread.sleep(500)
        val friends = (1..10).map { User(id = UUID.randomUUID(), name = "Suggested Friend $it") }
        callback.invoke(friends)
    }
}


data class SearchResult(
    val user: User,
    val friends: List<User> = emptyList(),
    val suggestedFriends: List<User> = emptyList()
)