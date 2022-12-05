package basics.collections

fun main() {

    val immutableList = listOf("Alice", "Bob")
    val valMutableList = mutableListOf("Carol", "Dave")
    var varMutableList = mutableListOf("Eve", "Frank")

    // One way to test membership
    val isBobThere1 = "Bob" in immutableList

    // Another way to test membership
    val isBobThere2 = immutableList.contains("Bob")
    val name: String = immutableList[0] // Access by index
    valMutableList[1] = "Bart" // Update item in list

    // immutableList[1] = “Bart" // Error: Can't change
    valMutableList.add(2, "Ellen") // Add item at index

    // Delete by index
    val removedPerson = valMutableList.removeAt(1)

    // Delete by value
    val wasRemoved = valMutableList.remove("Bart")

    // You can change the contents of a var mutable collection, and you CAN reassign it:
    varMutableList[0] = "Ellen"
    varMutableList = mutableListOf("Gemma", "Harry")
}