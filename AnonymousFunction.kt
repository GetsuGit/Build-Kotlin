fun main() {

    fun hello(name: String, ubahnama: (String) -> String): String {
        val nameTransform = ubahnama(name)
        return  "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.uppercase()
        }
    }

    println(hello("Getsu", upper))
        println(hello("", upper))

        // atau langsung
        println(hello("Code", fun(value: String): String {
            return value.lowercase()
        }))

}