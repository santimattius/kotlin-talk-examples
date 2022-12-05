package basics.objects

fun main() {
    val provider1 = DataProvider
    val provider2 = DataProvider

    DataProvider.addNumber(10)

    println(DataProvider.numbers)

    val create = MyClass.create()
}

object DataProvider {
    private val _numbers = mutableListOf<Int>()

    init {
        _numbers.addAll(listOf(1, 2, 3))
    }

    val numbers: List<Int>
        get() = _numbers

    fun addNumber(number: Int) {
        _numbers.add(number)
    }
}

class MyClass private constructor() {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}
