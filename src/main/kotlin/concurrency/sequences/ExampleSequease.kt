package concurrency.sequences

fun main() {
    // Sequence
    val sequence = sequenceOf(1, 2, 3, 4, 5)
    sequence.map { it.toString() }.filter { it.contains("2") }

    //List
    val list = listOf(1, 2, 3, 4, 5)
    val asSequence = list.asSequence().map { it.toString() }.filter { it.contains("2") }
    val newList = asSequence.toList()


    val seq = generateSequence(2) { it * 2 }.takeWhile { it < 10_000 }

    sequence {
        yield(2)
        yieldAll(listOf(1, 4, 5, 6))
    }
}