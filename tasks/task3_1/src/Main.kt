// Task 3.1: command line arguments

import kotlin.system.exitProcess


fun main(args: Array<String>) {
    if (args.size != 1) {
        exitProcess(1)
    }
}
