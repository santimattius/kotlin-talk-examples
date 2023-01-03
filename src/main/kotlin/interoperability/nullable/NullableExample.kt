package interoperability.nullable

fun main() {

    val example = JavaExample()

    val text: String? = example.text
    example.text = ""

    val value: Unit = example.print()

    if (example.`is`()) {

    }
}