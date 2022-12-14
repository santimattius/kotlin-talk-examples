package concurrency.flows

import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    //equivalente con lists
    val list = listOf(1, 2, 3, 4, 5)
    val flowOf = flowOf(1, 2, 3, 4, 5)

    // equivalente con secuencias
    val sequence = sequence {
        repeat(100) {
            yield(it)
        }
    }

    val intFlow = flow {
        repeat(100) {
            emit(it)
        }
    }
//        .filter { it % 2 == 0 }
//        .map { "Number: $it" }

    //Collect
//    delay(1000)
    intFlow.collect {
        println(it)
    }

    //Launch
    launch {
        intFlow.collect {
            println(it)
        }
    }
    launch {
        intFlow.collect {
            println(it)
        }
    }
}