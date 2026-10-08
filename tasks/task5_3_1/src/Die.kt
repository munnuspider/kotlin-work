// Task 5.1.2: rollDie() function
import kotlin.random.Random

fun rollDie(sides: Int) {
    if (sides in setOf(6)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}