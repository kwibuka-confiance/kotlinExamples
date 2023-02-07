fun main() {
    val calculate = calculate(12, 34, ::sum)
    println(calculate)
}

fun sum(num1: Int, num2: Int) = num1 + num2

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
