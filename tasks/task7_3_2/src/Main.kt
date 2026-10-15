// Task 7.3.2: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers[0] = 7
    numbers.add(1)
    println(numbers)
    val elementsToAdd = listOf(2, 5, 7)
    numbers.addAll(elementsToAdd)
    println(numbers)
    numbers.remove(2)
    println(numbers)
    val elementsToRemove = listOf(2, 5, 7)
    numbers.removeAll(elementsToRemove)
    println(numbers)
    numbers.removeAt(1)
    println(numbers)
    numbers.clear()
    println(numbers)
}