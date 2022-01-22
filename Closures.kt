fun main() {

    var counter: Int = 0
    var name: String = "Getsu"

    val lamdaIncrement: () -> Unit = {
        println("Lamda increment")
        counter++

        // name = "Code"
        // hati - hati saat mengubah nilai variabel menggukana closures
    }

    val anonymousIncrement = fun () {
        println("Anonymous Function increment")
        counter++
    }

    fun functionIncrement(){
        println("Function increment")
        counter++
    }

    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()

    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}