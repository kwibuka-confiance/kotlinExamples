fun main() {
    // for (num in 1 until 10) {
    //     println(num)
    // }

    // filter
    val x = 1..10
    val filteredNumber = x.filter { number -> number % 2 == 0 }

    println(filteredNumber)
}

fun multiplication(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun division(num1: Int, num2: Int): Int {
    return num1 / num2
}
