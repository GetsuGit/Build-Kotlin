fun main() {

    var array = arrayOf("Getsu", "Code", "Design" )

    // membuktikan perulangan
    var total = 0
    for (name in array){
        println(name)
        total++
    }
    println("Total perulangan = $total")

    println("==============")
    val ukuran = array.size - 1
    for (i in 0..ukuran){
        println("Index $i = ${array.get(i)}")
    }

}