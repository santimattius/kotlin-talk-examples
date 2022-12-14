package concurrency.callbackflow

import concurrency.flows.Note
import kotlinx.coroutines.runBlocking

class NoteViewModel {

    fun update(callback: (Note) -> Unit) {
        var count = 1
        while (true) {
            Thread.sleep(500)
            val note = Note(title = "Title $count", description = "Description $count")
            callback(note)
            println("Emitting ${note.title}")
            count++
        }
    }
}

fun main(): Unit = runBlocking {

    val viewModel = NoteViewModel()

}