fun main() {

    loopI@ for(i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i * $j = ${i * j}")

            if (i > 5){
                break@loopI
                // continue
            }
        }
    }

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@ {
        if (it == ""){
            return@test
        } else {
            println("Getsu")
        }
    }

}