// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    // Add code here to read names and numbers from the file
    for (i in "phone_csv") {
        val name = string.split().map(args[0], ",")
        val number = string.split().map(args[1])
    }
    val myMap = {args[0], args[1]}
    // and insert them as keys and values into the map
}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to Database.kt
    // the file, separated by a comma, one pairing per line
}
