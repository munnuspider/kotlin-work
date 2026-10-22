// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    if (args.isEmpty()) {
        println("input a filename to read from.")
        return
    }
    val filename = args[0]
    val data = readData(filename)
}
