package basics

//https://kotlinlang.org/docs/control-flow.html#if-expression

fun main() {
    val a = 1
    val b = 2
    val maxNumber = maxNumber(a, b)

    println("Max number $maxNumber")
}

fun maxNumber(a: Int, b: Int): Int {
    /*Step 1*/
//    var max: Int
//    if (a > b) {
//        max = a
//    } else {
//        max = b
//    }
//
//    return max
    /*Step 2*/
//    var max = a
//
//    if (a < b) max = b
//
//    return max
    /*Step 3*/
    val max = if (a > b) a else b
    return max
}
