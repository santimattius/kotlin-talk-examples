package advanced.generics


data class Product(val id: String, val name: String, val price: Double) : Converter {
    override fun toMap(): Map<String, Any?> {
       return mapOf("id" to this.id, "name" to this.name, "price" to this.price)
    }

}

//class JsonConverter(private val product: Product) {
//
//    fun toJson(): String {
//        return "{}"
//    }
//}

//class JsonConverter<T>(private val item: T) where T : Any {
//
//    fun toJson(): String {
//        return "{}"
//    }
//}
interface Converter {
    fun toMap(): Map<String, Any?>
}

class JsonConverter<T>(private val item: T) where T : Converter {

    fun toJson(): String {
        return item.toMap()
            .toList()
            .joinToString(separator = ",", prefix = "{", postfix = "}") {
                "\"${it.first}\":${it.second}"
            }
    }
}

fun main() {

    val product = Product("_id", "Supremita", 20.0)

    val jsonConverter = JsonConverter(product)
//    val jsonConverter2 = JsonConverter(null)

    val json = jsonConverter.toJson()
    println(json)
}