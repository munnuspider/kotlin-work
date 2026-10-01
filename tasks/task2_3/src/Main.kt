// Task 2.3

fun main() {
    val myAge = 29u
    val universeAge = 13_800_000_000L
    val status = 'M'
    val name = "Sarah"
    val height = 1.78f
    val root2 = Math.sqrt(2.0)
    println(myAge::class) /*kotlin.UInt*/
    println(universeAge::class) /*kotlin.Long*/
    println(status::class) /*kotlin.Char*/
    println(name::class) /*kotlin.String*/
    println(height::class) /*kotlin.Float*/
    println(root2::class) /*kotlin.Double*/

    /*Exercise 2.3*/
    /*val pi: Float = 3.14159*/ /*this is a compilation error - replace float with double*/
    val pi: Double = 3.14159
}
