// Task 5.5: anagrams() function
infix fun String.anagramOf(other: String): Boolean {
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = other.lowercase().toList().sorted()
    return firstChars == secondChars
}