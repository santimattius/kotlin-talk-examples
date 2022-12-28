package advanced.destructuring

data class User(val nickName: String, val password: String)

fun main() {

    val user = User(nickName = "admin", password = "1234")

    val (nick, pass) = user

    println("NickName: $nick")
    println("Password: $pass")

}
