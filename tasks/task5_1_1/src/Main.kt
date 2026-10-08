// Task 5.1.1: main program
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Missing arguments")
        exitProcess(1)
    }
    val wordOne = args[0]
    val wordTwo = args[1]

    val result = anagrams(wordOne, wordTwo)
    if (result) {
        println("They are anagrams")
    }
    else {
        println("Not anagrams")
    }
}
