package advanced.scope

data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}

fun main() {

    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }

//    val alice = Person("Alice", 20, "Amsterdam")
//    println(alice)
//    alice.moveTo("London")
//    alice.incrementAge()
//    println(alice)


}