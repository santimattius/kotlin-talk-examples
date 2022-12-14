package concurrency.channels

import concurrency.flows.Note
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class NoteViewModel {

    //    private var _state = Channel<Note>()
    private var _state = Channel<Note>(capacity = Channel.BUFFERED)

    //    val state = _state.receiveAsFlow()
    val state = _state

    suspend fun update() {
        var count = 1

//        while (true) {
        while (!_state.isClosedForSend) {
            delay(500)
            val note = Note(title = "Title $count", description = "Description $count")
            _state.send(note)
//            _state.trySend(note)
            println("Emitting ${note.title}")
            count++
            if (count > 8) {
                _state.close()
            }
        }
    }
}

fun main(): Unit = runBlocking {

    val viewModel = NoteViewModel()
    launch {
        viewModel.update()
    }
    delay(1_000)
//    viewModel.state.distinctUntilChanged().collect {
//        delay(1_000)
//        println(it)
//    }
    for (state in viewModel.state) {
        delay(1_000)
        println(state)
    }
}