// Task 7.7.1: statistics functions
fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty()) {"Cannot compute median of an empty list"}
    val sorted = numbers.sorted()
    val mid = sorted.size / 2

    return if (sorted.size % 2 == 1) {
        sorted[mid]
    }
    else {
        (sorted[mid - 1] + sorted[mid]) / 2f
    }
}


fun displayStats(numbers: List<Float>) {
    if (numbers.isEmpty()) {
        println("No data available")
        return
    }
    println("Minimum: ${numbers.minOrNull()}")
    println("Maximum: ${numbers.maxOrNull()}")
    println("Mean": ${numbers.average()}")
    println("Median: ${numbers.median}")
}