// Task 12.4.1: Circle class
import kotlin.math.PI
import kotlin.math.hypot

class Circle(val centre: Point, val radius: Double) {
    fun area(): Double = PI * radius * radius

    fun perimeter(): Double = PI * radius * 2

    fun contains(point: Point): Boolean {
        val dist = hypot(point.x - centre.x, point.y - centre.y)
        return dist <= radius
    }

    init {
        require(radius >= 0) { "radius can't be negative" }
    }
}
