package advanced.inline

fun test() {
    printObject { 23 }

    listOf(1, 2, 3, 4, 5, 6).kotlinFilter { it % 2 == 0 }
}

//inline fun printObject(obj: Any) {
//    println(obj)
//}

fun printObject(f: () -> Any) {
    println(f())
}

inline fun List<Int>.kotlinFilter(noinline condition: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (value in this) {
        if (condition(value)) {
            result.add(value)
        }
    }
//    f2(condition)
    return result
}

fun f2(condition: (Int) -> Boolean) {

}