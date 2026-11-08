// Task 12.8.1: demo program for Day enum class
fun main() {
    println("enter your day of the week: ")
    val input = readln().trim()

    try {
        val day = Day.valueOf(input)
        println(day)
    } catch (e: IllegalArgumentException) {
        return
    }
}
