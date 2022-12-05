package basics

// https://kotlinlang.org/docs/functions.html
fun main() {
    val a = 1
    val b = 2
    val sum = sum(a, b)
    println(" $a + $b = $sum")
    val sumOne = sumOne(a)
    println(" $a + 1 = $sumOne")

    asyncSum(a, b) { result ->
        println(" $a + $b = $result")
    }

    val result = operation(b = b, a = a) { first, second ->
        first * second
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun asyncSum(a: Int, b: Int, result: (Int) -> Unit) {
    result.invoke(a + b)
}

fun operation(a: Int, b: Int, result: (Int, Int) -> Int): Int {
    return result.invoke(a, b)
}

fun sumOne(a: Int, b: Int = 1): Int {
    return sum(a, b)
}
