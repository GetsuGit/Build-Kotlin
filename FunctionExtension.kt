fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {

    val name = "Getsu"

    println(name.hello())

    name.printHello() 

    // mereplace variable name
    "Code".printHello()

}