package concurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread


fun main() {
    println("Coroutine vs Threads")
    println("Coroutine")
    runBlocking {
        repeat((1..1_000_000).count()) {
            launch {
                delay(1000L)
                print("*")
            }
        }
    }
    println("Threads")
    repeat((1..1_000_000).count()) {
        thread {
            Thread.sleep(1000L)
            println("*")
        }
    }
}