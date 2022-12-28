package advanced.types

data class Point(val x: Int, val y: Int)

typealias PointConverter = (x: Int, y: Int) -> Point

fun main() {
    val toPoint: (x: Int, y: Int) -> Point = { x: Int, y: Int ->
        Point(x = x, y = y)
    }
}
