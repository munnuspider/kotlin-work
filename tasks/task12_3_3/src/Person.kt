// Task 12.3.3: Person class with secondary constructor
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    constructor() : this("Bhavya Trivedi", LocalDate(1997, 9, 22))

    init {
        require(name.isNotBlank()) { "name cannot be blank" }
    }
}