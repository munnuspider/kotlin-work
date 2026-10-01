// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val content = "my name is bhavya"
    val filePath = Path("test.txt")
    filePath.writeText(content)
    filePath.appendText(" new text added")
    val fileContents = filePath.readText()
    println(fileContents)
}
