package concurrency.suspended

import java.util.UUID


data class User(val id: UUID, val name: String)

class AuthenticationService {

    suspend fun login(userName: String, password: String): User {
        //Thread.sleep(500)
        return User(id = UUID.randomUUID(), name = userName)

    }
}

class FriendsService {

    suspend fun currents(user: User): List<User> {
//        Thread.sleep(500)
        return (1..10).map { User(id = UUID.randomUUID(), name = "Friend $it") }
    }

    suspend fun suggestions(user: User): List<User> {
//        Thread.sleep(500)
        return (1..10).map { User(id = UUID.randomUUID(), name = "Suggested Friend $it") }
    }
}


data class SearchResult(
    val user: User,
    val friends: List<User> = emptyList(),
    val suggestedFriends: List<User> = emptyList()
)