package advanced.varoutin

class GenericClass<T>(val item: T) {

    fun run(): String = ""
}

fun main() {
//    val list : MutableList<Int> = mutableListOf(1,2,3)
//    val list2: MutableList<Number> = list
//    list2.add(50f)
//    val i = list[3]

    val list : List<Int> = listOf(1,2,3)
    val list2: List<Number> = list
//    list2.add(50f)
    val i = list[3]

}