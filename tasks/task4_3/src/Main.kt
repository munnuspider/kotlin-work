// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size < 3) {
        println("error: missing module mark")
        exitProcess(1)
    }
    val mark1 = args[0].toDouble()
    val mark2 = args[1].toDouble()
    val mark3 = args[2].toDouble()

    val averageMark = ((mark1 + mark2 + mark3) / 3).roundToInt()
    when (averageMark) {
        in 70..100 -> println("Distinction")
        in 40..69 -> println("Pass")
        else -> println("Fail")
    }
}
