// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.isEmpty()) {
        println("enter a filename")
        exitProcess(1)
    }
    val fileName = args[0]
    val fileData = fetchData(fileName)
    val lowest = fileData.minBy { it.second }
    val highest = fileData.maxBy { it.second }

    println("average temperature: ${fileData.map { it.second }.average()}")
}
