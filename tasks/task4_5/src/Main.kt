// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size < 1) {
        println("Missing input")
        exitProcess(1)
    }
    val rangeInput = args[0].toInt()
    var sum = 0
    for (n in 1..rangeInput) {
        if (n % 2 != 0) {
            sum += n
        }
    }
    println(sum)
}
