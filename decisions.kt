import java.util.Scanner

fun main (){
    var reader = Scanner(System.in);
    print("Enter the Number: ")
    var number = reader.nextInt()

    var result = if(number > 0){
        print("$number is not positive")
    } else if(number <0) {
        println("number is positive")
    } else {
       println(" number is 0")
    }
    print(result)




}