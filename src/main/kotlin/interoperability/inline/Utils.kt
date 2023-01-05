@file:JvmName("Converter")

package interoperability.inline

inline fun convertToString(block: () -> Any): String {
    return "${block()}"
}

fun main() {
    for (value in (0..10)) {
        val string = convertToString { value }
        println(string)
    }
}