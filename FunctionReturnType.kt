// Int adalah nilai yang akan di kembalikan
fun jumlahkan(a : Int, b : Int): Int{
    val total = a + b
    return total
}

fun main() {

   println(jumlahkan(2,3))
    println(jumlahkan(2, 4))

    val result = jumlahkan(200, 200)
    println(result)
}