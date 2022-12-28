package advanced.reified

fun <T> myType(clazz: Class<T>) {
    println(clazz.simpleName)
}


fun main() {
    myType(String::class.java)

}