package concurrency.callbackflow

import concurrency.flows.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch
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

fun NoteViewModel.updateAsFlow(): Flow<Note> = callbackFlow {
    update { trySend(it) }
//    awaitClose {  }
}

fun main(): Unit = runBlocking {

    val viewModel = NoteViewModel()
   launch(Dispatchers.Default) {
       viewModel.updateAsFlow().collect {
           println(it)
       }
   }
}