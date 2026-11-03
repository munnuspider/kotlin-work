// Task 12.5.2: class with a custom getter

import kotlinx.datetime.LocalDate

class Person(_name: String, val birth: LocalDate) {
    var isMarried = false
    constructor() : this("Bhavya Trivedi", LocalDate(1997, 9, 22))

    var name = _name
        get() {
            return field.uppercase()
        }
}
