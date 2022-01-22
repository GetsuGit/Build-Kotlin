fun main() {

    val nilai = "A"

    when (nilai) {

         "A" -> {
             println("Amazing")
         }
         "B" -> {
             println("Good")
         }
         "C" -> {
             println("Not Bad")
         }
         "D" -> {
             println("Bad")
         }
         else -> {
             println("Try Again")
         }

    }


    when(nilai){
        // if (nilai == "A" || nilai == "B" || nilai == "C")
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf, Anda Tidak Lulus")
        }
    }

}