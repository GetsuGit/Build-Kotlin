fun main() {

    val nilai = "C"

    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Maaf, Tidak Lulus")
    }

    // when Expression is
    val name = "Getsu"
    when(name){
        is String -> println("Name is String")
        !is String -> println("Name is not string")

    }

    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Try Again")
    }

}