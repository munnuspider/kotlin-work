// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Input a filename to read from.")
        return
    }
    val filename = args[0]
    val data = readData(filename)
    displayStats(data)
}