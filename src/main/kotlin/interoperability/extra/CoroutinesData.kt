package interoperability.extra

import kotlinx.coroutines.delay

object CoroutinesData {

    suspend fun getNumbers(): List<Int> {
        delay(1000)
        return (0..10).map { it }
    }
}