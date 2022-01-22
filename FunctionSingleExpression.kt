fun kaliDua(a:Int): Int {
    return a * 2
}

// single Expressionnya
fun kaliDuaA(a:Int): Int = a * 2

fun sapa(name: String): Unit = println("Hello $name")

fun main() {
    println(kaliDuaA(10))
    sapa("Getsu")
}