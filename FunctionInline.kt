inline fun hello(name: () -> String ): String {
    return "Hello ${name()}"
}

fun main() {
   println(hello {"Getsu"})
    println(hello {"Getsu"})
}
