package concurrency.flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

data class Note(val title: String, val description: String)

class ViewModel {

    //    var state = Note(title = "Hello Flows", description = "Flows in Kotlin")
    //var state: MutableStateFlow<Note> = MutableStateFlow(Note(title = "Hello Flows", description = "Flows in Kotlin"))
    //TODO: en la version 1.7 de kotlin no es necesario
    private var _state: MutableStateFlow<Note> = MutableStateFlow(Note(title = "Hello Flows", description = "Flows in Kotlin"))
    val state: StateFlow<Note> = _state.asStateFlow()

    suspend fun update() {
        var count = 1

        while (true) {
            delay(2_000)
            count++
            _state.value = _state.value.copy(title = "Title $count", description = "Description $count")
        }
    }
}

fun main(): Unit = runBlocking {

    val viewModel = ViewModel()

//    viewModel.update()
    launch {
        viewModel.update()
    }
//    println(viewModel.state)
    viewModel.state.collect(::println)
}