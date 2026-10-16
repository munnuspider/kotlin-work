// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document: String, toRedact: String, redactionChar: Char = 'X'): String {
    if (toRedact.isEmpty()) {
        return document
    }
    val replacement = redactionChar.toString().repeat(toRedact.length)
    return document.replace(toRedact, replacement)
}