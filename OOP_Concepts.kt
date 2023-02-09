fun main() {
    // Employee().insertValue("Kwibuka", 23, 'M', 460600.4)
    // OuterClass.InnerClass().concantine("Confiance")
    // var company = Company()
    // company.name = "Swift M"
    // print(company.name)

    // var y = Person()
    // y.fullName = "swift motion"

    // println(y.firstname)
    // println(y.lastname)

    val store = Store()
    store.products.add(Product("Nike Shoes", 23.23))
    store.products.add(Product("Adiddas Shoes", 69.23))
    store.products.add(Product("Timber Shoes", 100.23))

    val total_price = store.totalPrice
    println(total_price)
}

class employee {
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

// GETTERS AND SETTERS
class Company {
    var name: String = "Swift Motion"
        get() = field
        set(value) {
            field = value
        }
}

// class Person {
//     var firstname: String = ""
//     var lastname: String = ""
//     var fullName: String
//         get() = "$firstname $lastname"
//         set(value) {
//             var names = value.split(" ")
//             firstname = names[0].toUpperCase()
//             lastname = names[1].capitalize()
//         }

//         private set
//         fun motion(){}
// }

class Product(val name: String, var price: Double)

class Store {
    var products = mutableListOf<Product>()

    val totalPrice: Double
        get() = products.sumByDouble { it.price }
}
