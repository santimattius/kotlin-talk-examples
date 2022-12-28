package advanced.destructuring

data class User(val nickName: String, val password: String)

fun main() {

    val user = User(nickName = "admin", password = "1234")

    val (nick, pass) = user

    val map = mapOf("a" to 1, "b" to 2)

    for ((k, v) in map) {
        println("$k - $v")
    }

    val pairValue = pairValue()
//    pairValue.component1()
}

fun pairValue(): Pair<String, Int> = "c" to 3