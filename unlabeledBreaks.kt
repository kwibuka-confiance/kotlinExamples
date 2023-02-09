fun main() {
    // try {
    //     var num: Int = 50 / 0
    //     println("Beginers ")
    //     println(num)
    // } catch (c: Exception) {
    //     println("It is not allowed to divide number by zero")
    // }
    ConstructorClass(12, 34)
}

class ConstructorClass {
    constructor(x: Int, y: Int) {
        var area = x * y
        println(area)
    }
}
