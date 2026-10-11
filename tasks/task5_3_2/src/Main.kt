// Task 5.3.2: main program
fun main(args: Array<String>) {
    val (numDice, sides) = args[0].split("d").map { it.toInt() }
    rollDice(sides= sides, noOfdie = numDice)
}