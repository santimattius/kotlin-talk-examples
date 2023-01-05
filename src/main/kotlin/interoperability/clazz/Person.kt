package interoperability.clazz

data class Person(val name: String, val age: Int)


fun main() {
    val person1 = Person(name = "Santiago", age = 29)
    val person2 = Person(name = "Santiago", age = 29)

    if (person1 == person2) {
        println("Is Cloned")
    } else {
        println("Nothing")
    }

    val person3 = person2.copy(age = 30)
}