package concurrency.flows

import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val flowOfInt = flow {
//        withContext(Dispatchers.IO) {
        repeat(100) {
            emit(it)
//            }
        }
    }

    flowOfInt
//        .flowOn(Dispatchers.IO)
        .catch { cause: Throwable ->
            println(cause)

        }
        .collect {
            println(it)
        }
}