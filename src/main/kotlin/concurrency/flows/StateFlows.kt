package concurrency.flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

data class Note(val title: String, val description: String)

class ViewModel {


    suspend fun update() {
        var count = 1

        while (true) {
            delay(2_000)
            count++
        }
    }
}

fun main(): Unit = runBlocking {

    val viewModel = ViewModel()
    launch {
        viewModel.update()
    }

}