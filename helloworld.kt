fun main() {
    val fruits = arrayOf<String>("Grapes", "Guava", "Oranges", "Apples", null.toString())
    for (item in fruits) {

        println(item)
    }
}

fun multiplication(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun division(num1: Int, num2: Int): Int {
    return num1 / num2
}
