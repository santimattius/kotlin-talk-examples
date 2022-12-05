package basics

//https://kotlinlang.org/docs/control-flow.html#for-loops
fun main() {
    // step 1
    val numbers = listOf(1, 2, 3, 4)
    for (num in numbers) {
        println(num)
    }

    for (i in numbers.indices) {
        println(i)
    }

    for ((index, value) in numbers.withIndex()) {
        println("the element at $index is $value")
    }

    // step 2 - using progressions
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    //returns and jumps
    val number = containNumber(numbers, 2)
    println(number)
}

fun containNumber(numbers: List<Int>, i: Int): Boolean {
//    var result = false
//    for (number in numbers) {
//        if (number == i) {
//            result = true
//        } else {
//            continue
//        }
//    }
//    return result
    for (number in numbers) {
        if (number == i) {
           return true
        }
    }
    return false
}
