package basics.types

fun main() {
    //is operator and smart cast
    printLength("Hello")

    // unsafe
    val y: Any? = "Hello world"
    val x: String? = y as String?
    // safe nullable cast
    val z: String? =  y as? String

}

fun printLength(obj: Any) {
//    if (obj is String) {
//        println(obj.length)
//    } else {
//        println("Not a String")
//    }
    if (obj !is String) return

    println(obj.length)
}

fun printStringLength(obj: String) {
    println(obj.length)
}