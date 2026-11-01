// Task 12.3.3: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(1997, 8, 23)
    val p = Person()
    
    println("name: ${p.name}")
    println("is married?: ${p.isMarried}")
    println("dob: ${p.birth}")

    //val q = Person("   ", date)
    //println("name: ${q.name}")
    //println("dob: ${q.birth}")
    
}

