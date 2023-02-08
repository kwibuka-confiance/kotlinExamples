fun main() {
    try {
        var num: Int = 50 / 0
        println("Beginers ")
        println(num)
    } catch (c: Exception) {
        println("It is not allowed to divide number by zero")
    }
}
