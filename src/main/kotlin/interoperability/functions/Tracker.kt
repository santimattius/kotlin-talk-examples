@file:JvmName("Tracker")

package interoperability.functions

import java.text.SimpleDateFormat
import java.util.Date

@JvmOverloads
fun send(eventName: String, extras: Map<String, Any> = emptyMap(), date: Date = Date()) {
    println(
        """
        Event: $eventName
        Extras: $extras
        Date: ${date.format()}
    """.trimIndent()
    )
}

fun Date.format(): String {
    val dateFormat = SimpleDateFormat("dd-MM-yyyy")
    return dateFormat.format(this)
}
