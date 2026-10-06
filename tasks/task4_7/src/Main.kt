// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Missing file argument")
        return
    }
    val path = Path(args[0])
     var currentLineNum = 0
     var longestIndex = 0
     var maxLength = -1

     path.forEachLine { line ->
        currentLineNum ++
        if (line.length > maxLength) {
            maxLength = line.length
            longestIndex = currentLineNum
        }
     }
     if (currentLineNum > 0) {
        println("Line $longestIndex is the longest (length = $maxLength)")
     }
     else {
        println("Empty file")
     }
}
