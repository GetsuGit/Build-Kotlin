


fun main(){

    fun hello(name: String, transform: (String) -> String): String{
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String{
        if (value == ""){
            return "UPS"
        } else {
            return value.uppercase()
        }
    }

    println(hello("Getsu Code", upper))
    println(hello("", upper))


}