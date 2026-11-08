// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Bhavya", birth=LocalDate(2006, 9, 22))
    println(p.name)
    println(p.age)
}