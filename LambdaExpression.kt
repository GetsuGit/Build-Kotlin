// lamba methode reference
fun toUpper(value: String): String = value.uppercase()

fun main() {

    // lamba
    // parameternya string nilai kembali string
    val contohLamda: (String, String) -> String = {
        firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLamda("Username", "Password")
    println(result)

    // lamba it hanya untuk satu parameter
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Getsu"))

    // lamda metehod reference
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Getsu Code"))

}