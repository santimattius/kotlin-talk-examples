package basics.collections

fun main() {
    val immutableMap = mapOf("name" to "Kirk", "rank" to "captain")
    val mutableMap = mutableMapOf(
        "name" to "Picard",
        "rank" to "captain"
    )
    // Is this key in the map?
    val hasRankKey = immutableMap.containsKey("rank")

    // Is this value in the map?
    val hasKirkValue = immutableMap.containsValue("Kirk")

    // Access by key, returns nullable
    val name: String? = immutableMap["name"]

    // Update value for key
    mutableMap["name"] = "Janeway"

    // Add new key and value
    mutableMap["ship"] = "Voyager"
    mutableMap.remove("rank") // Delete by key

    // Delete by key and value
    mutableMap.remove("ship", "Voyager")

    // Won't work, value doesn't match
    mutableMap.remove("name", "Spock")
}