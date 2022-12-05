package basics

//https://kotlinlang.org/docs/exceptions.html#the-nothing-type

fun main() {
    val personName:String? = null
    val s = personName ?: fail("Name required")
    println(s)

    val x = null           // 'x' has type `Nothing?`
    val l = listOf(null)   // 'l' has type `List<Nothing?>
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}