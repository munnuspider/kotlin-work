// Task 12.1: Point class
//class Point constructor(x: Double, y: Double) {
    //var x = x
    //var y = y
//}
import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(other: Point) = hypot(other.x - x, other.y - y)
}


