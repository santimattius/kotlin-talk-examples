//@file:JvmName("Utils")
package interoperability.functions


fun printString(str: String) {
    println("String: $str")
}

fun printAndNext(str: String, next: () -> Unit) {
    println("String: $str")
    next()
}

fun String.print() {
    println("String: $this")
}

fun String.printAndNext2(next: () -> Unit) {
    println("String: $this")
    next()
}