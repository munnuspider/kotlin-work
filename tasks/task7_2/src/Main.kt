// Task 7.2: array comparison
fun main() {
    val numbers = intArrayOf(9, 6, 3, 2)
    val cls = numbers::class
    println(cls.qualifiedName)
    println(cls.java)

    val x = intArrayOf(9, 3, 6, 2, 8, 5)
    print(x[0]) //prints 9
    x[6] = 0 // exception triggered as valid indices are from 0 to 5
    println(x.slice(2..4)) // returns a list containing values in idices 2, 3 and 4 inclusive
}

/* with arrayOf()
✓ Compilation successful for task7_2 [jvm]
Error: Could not find or load main class MainKt
Caused by: java.lang.ClassNotFoundException: MainKt

ERROR: Task ':task7_2:runJvm' failed: Process failed with exit code 1 */ 

/* with intArrayOf()
✓ Compilation successful for task7_2 [jvm]
kotlin.IntArray
class [I */