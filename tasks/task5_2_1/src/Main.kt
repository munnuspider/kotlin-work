// Task 5.2.1: main program
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Missing argument")
        return
    }
    val radius = args[0].toDouble()
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    System.out.printf("Area= %.4f", area)
    System.out.printf("Perimeter= %.4f", perimeter)
}