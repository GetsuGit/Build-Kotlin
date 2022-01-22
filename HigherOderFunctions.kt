fun main() {

    // nilai lamba dan output lamda string
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return  "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.uppercase()}

    println(hello("Getsu Lamda", lambdaUpper))

    println(hello("Getsu", { value: String -> value.uppercase() }))

    // trailing lamda
    println(hello("Getsu") { value: String ->
        value.lowercase()
    })


}