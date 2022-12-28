package advanced.contracts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

data class MyEvent(val message: String)

@ExperimentalContracts
fun processEvent(event: Any?) {
    if (isInterested(event)) {
        println(event.message)
    }
}

@ExperimentalContracts
fun isInterested(event: Any?): Boolean {
    contract {
        returns(true) implies (event is MyEvent)
    }
    return event is MyEvent
}

@OptIn(ExperimentalContracts::class)
fun main() {
    val event = MyEvent("Hello")
    processEvent(event)

    processEvent(10)
}