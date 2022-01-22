fun main() {

    for (i in 0..100){
        println(i)
    }

    println("=============")

    // for range step
    for (i in 0..100 step 2 ){
        println(i)
    }

    println("=============")

    // for range downTo
    for (i in 100 downTo 0 step 2 ){
        println(i)
    }


}