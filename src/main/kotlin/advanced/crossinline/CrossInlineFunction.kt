package advanced.crossinline

//https://www.baeldung.com/kotlin/crossinline-vs-noinline
//https://kotlinlang.org/docs/inline-functions.html#non-local-returns

//fun foo() {
//    val f = {
//        println("Hello")
//        return // won't compile
//    }
//}

inline fun foo(f: () -> Unit) {
//    bar { f() }
}

fun bar(f: () -> Unit) {
    f()
}

fun main() {
    foo {
        println("Hello World")
        return
    }

    bar {
        println("Hello World")
//        return // root cause
    }
}