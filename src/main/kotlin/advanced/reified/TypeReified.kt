package advanced.reified

fun <T> myType(clazz: Class<T>) {
    println(clazz.simpleName)
}

inline fun <reified T> myTypeReified() {
    println(T::class.java.simpleName)
}

fun main() {
    myType(String::class.java)
    myTypeReified<String>()
}