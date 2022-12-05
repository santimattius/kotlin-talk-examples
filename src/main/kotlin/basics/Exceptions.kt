package basics

import java.lang.NumberFormatException

//https://kotlinlang.org/docs/exceptions.html
fun main() {

    try {
        printStringSize(null)
    } catch (ex: IllegalArgumentException) {
        println(ex.message)
    }

    val stringIntValue: Int? = stringToInt("Hello")
}

fun printStringSize(str: String?) {
//    try {
//        println("String Size" + str!!.length)
//    } catch (ex: NullPointerException) {
////        println("str is null")
//        throw IllegalArgumentException("str is null")
//    } finally {
//        println("printing end")
//    }
    val safeInput = getSafeInput(str)
    println(safeInput.length)
}

private fun getSafeInput(str: String?) = str ?: throw IllegalArgumentException("str is null")


fun stringToInt(str: String) = try {
    str.toInt()
} catch (e: NumberFormatException) {
    null
}