package interoperability.objects

import java.util.UUID

object DataProvider {

    @JvmField
    val numbers = (0..10).map { it }.toMutableList()

    @JvmStatic
    fun randomId() = UUID.randomUUID().toString()
}