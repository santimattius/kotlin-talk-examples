package basics

//https://kotlinlang.org/docs/classes.html

fun main() {
//    val firstPerson = Person("Santiago", "Mattiauda")
//    val secondPerson = Person("name", "lastname", withCar = true)
//    val copyPerson = Person(person = firstPerson)

    val user1 = User("Santiago", 29)
    val user2 = User("Santiago", 29)
    println(user1 == user2)
}

class Person constructor(
    val firstName: String,
    val lastName: String,
    val withCar: Boolean = false
) {
    val completeName = "$firstName $lastName"

    constructor(person: Person) : this(person.firstName, person.lastName)
}


data class User(val name: String, val age: Int)