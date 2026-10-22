// Task 9.6: variance() function
fun variance(numbers: List<Double>, isSample: Boolean = true): Double {
    require(numbers.isNotEmpty()) {"cannot compute variance of an empty list"}
    numbers.sorted()
    val n = numbers.size
    val minSize = if (isSample) 2 else 1 
    if (n < minSize) return Double.NaN

    val mean = numbers.average()
    val squareDiffs = numbers.sumOf { (it - mean).let { diff -> diff * diff } }
    val divisor = if (isSample) n - 1 else n
    return squareDiffs / divisor


}
