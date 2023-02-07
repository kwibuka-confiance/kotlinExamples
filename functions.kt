fun main() {
    val calculate = calculate(12, 34, ::sum)
    println(calculate)
    print(upperCase("Hello Motion"))
    myFunction({ println("Hello motion") })
}

fun sum(num1: Int, num2: Int) = num1 + num2

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
// Lambda Function
var upperCase = { str: String -> str.toUpperCase() }

// Inline Function
inline fun myFunction(function: () -> Unit) {
    println("Am inline function -A")
    function()
    println("Am inline function -B")
}
