fun main() {

    var price : Long = 9_000_000_000L
    println(price)

    var priceInt: Int = price.toInt()
    println(priceInt)
    // overflow

    var binary: Int = 0b010101010
    println(binary)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)

}