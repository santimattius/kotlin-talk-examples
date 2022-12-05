package basics

//https://kotlinlang.org/docs/control-flow.html#when-expression
fun main() {
    val x = 1
    printNumber(x)

    val numericValue = getNumericValue(Bit.ZERO)
    println(numericValue)
}

fun printNumber(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}

enum class Bit {
    ZERO, ONE
}

fun getNumericValue(bit: Bit): Int {
    val numericValue = when (bit) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
    }
    return numericValue
}