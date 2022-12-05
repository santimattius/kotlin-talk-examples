package basics

fun main() {
    val emptyString = String.empty()
    val nullableClass: NullableClass? = NullableClass()

    if (nullableClass.isNull()) {

    } else {
        nullableClass?.sayHello()
    }
}

fun String.Companion.empty() = ""

fun Any?.isNull() = this == null

class NullableClass {
    fun sayHello() = println("Hello")
}