// Task 12.1: program that uses a Point object
fun main() {
    val p = Point(3.4, 6.7)
    println("x: ${p.x}")
    println("y: ${p.y}")
    println("distance from origin: ${p.distance()}")
    val target = Point(8.9, 4.0)
    println("distance to target: ${p.distanceTo(target)}")
}
