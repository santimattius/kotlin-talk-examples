package concurrency.channels

import concurrency.flows.Note
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class NoteViewModel {

    suspend fun update() {
        var count = 1
        while (true) {
            delay(500)
            val note = Note(title = "Title $count", description = "Description $count")
            println("Emitting ${note.title}")
            count++
        }
    }
}

fun main(): Unit = runBlocking {

    val viewModel = NoteViewModel()
    launch {
        viewModel.update()
    }

}