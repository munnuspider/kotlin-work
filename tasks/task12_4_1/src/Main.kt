// Task 12.4.1: main program
fun main() {
    val centrept = Point(5, 4)
    val circle = Circle(centre = centrept, radius = 5.0)

    println("area: ${circle.area()}")
    println("perimeter: ${circle.perimeter()}")

    val testpt = Point(3, 4)
    println("contains test point: ${circle.contains(testpt)}")
}