// Task 5.4.1: main program
fun main() {
    val shortString = "Hello World!"
    val exactString = "12345678901234567890"
    val longestString = "My name is Leon Kennedy and I am a US Agent"

    println(shortString.isTooLong())
    println(exactString.isTooLong())
    println(longestString.isTooLong())
}