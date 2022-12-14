package concurrency.flows

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class NoteViewModel {

//    private var _state = MutableSharedFlow<Note>()

    //replay: cuantos valores queremos que almacene
//    private var _state = MutableSharedFlow<Note>(replay = 1)

    //extraBufferCapacity: capasidad de almacenamiento extra.
//    private var _state = MutableSharedFlow<Note>(replay = 3, extraBufferCapacity = 3)
//    private var _state = MutableSharedFlow<Note>(replay = 3, extraBufferCapacity = 3, onBufferOverflow = BufferOverflow.DROP_OLDEST)
//    private var _state = MutableSharedFlow<Note>(replay = 3, extraBufferCapacity = 3, onBufferOverflow = BufferOverflow.DROP_LATEST)
    //emitando un stateflow
    private var _state = MutableSharedFlow<Note>(replay = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val state = _state.asSharedFlow()

    suspend fun update() {
        var count = 1

        while (true) {
            delay(500)
            val note = Note(title = "Title $count", description = "Description $count")
            _state.emit(note)
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
    delay(1_000)
//    viewModel.state.collect{
//        delay(500)
//        println(it)
//    }
    viewModel.state.distinctUntilChanged().collect{
        delay(1_000)
        println(it)
    }
}