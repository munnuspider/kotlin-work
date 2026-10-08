// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int, noOfdie: Int) {
    val sum = 0
    for (n in 1..noOfdie) {
        if (sides in setOf(6)) {
            val result = Random.nextInt(1, sides + 1)
            sum += result
        }
    }
    println("Total is $sum")
}