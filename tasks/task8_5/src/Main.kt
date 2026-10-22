// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    fun main() {
        val text = "This is a test text."

        val vowelCount = text.howMany { it.lowercaseChar() in "aeiou" }
        println("Vowels (howMany): $vowelCount")
        
        val letterCount text.howMany { it.isDigit() }
        println("Digits (howMany): $letterCount")

        val upperCount text.howMany { it.isUppercase() }
        println("Uppercase (howMany): $upperCount")

        val spaceCount text.howMany { it == ' ' }
        println("Spaces (howMany): $spaceCount")
    }
}
