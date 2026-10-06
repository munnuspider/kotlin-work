// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("""PIZZA MENU
    (a) Margherita
    (b) Ham and Pineapple
    (c) Pepperoni
    (d) Veggie Sizzler
    Choose your pizza (a-d): """)
    val pizzaOrder = readln().lowercase()
    if (pizzaOrder in "a".."d") {
        println("Order accepted")
    }
    else {
        println("Invalid choice!")
    }
}
