fun main() {
    // Employee().insertValue("Kwibuka", 23, 'M', 460600.4)
    OuterClass.InnerClass().concantine("Confiance")
}

class Employee {
    var name: String = ""
    var age: Int = 0
    var gender: Char = 'M'
    var salary: Double = 0.toDouble()

    fun insertValue(a: String, n: Int, g: Char, s: Double) {
        name = a
        age = n
        gender = g
        salary = s

        println("Salary of $name is $salary")
    }
}

// NESTED CLASS
class OuterClass {
    var str: String = "Outer class"

    class InnerClass {
        var str2 = " Nested Class"

        fun concantine(str: String) {
            var fullname = str.plus(str2)
            println(fullname)
        }
    }
}
