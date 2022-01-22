fun sayHello(name: String, grade: String){
    println("Hello $name $grade")
}

// Function Default Parameter
fun hello(firstName: String, lastName: String? = null ){

    if (lastName == null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }

}

fun main() {
    sayHello("Getsu", "A")
    sayHello("Budi","B")

    hello("Getsu")
    hello("Getsu", "Code")
}