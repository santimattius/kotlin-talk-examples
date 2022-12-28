package advanced.contracts

import kotlin.contracts.ExperimentalContracts

data class MyEvent(val message: String)


@OptIn(ExperimentalContracts::class)
fun main() {
    val event = MyEvent("Hello")

}