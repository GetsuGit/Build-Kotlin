fun main(){

    println("===== Welcome To M3 Champion 2021 =====")

    val breakout = 3
    val teamUp = arrayOf(1, 2, 3)

    when (breakout){
        in teamUp -> println("Next Macth")
        !in teamUp -> println("Execute")
    }

    println("===== M3 Group A =====")
    var teamGroup = arrayOf("RRQ", "ONIC", "BDL", "BLCK", "EVOS")

    val match = teamGroup.size - 1
    for (i in 0..match){
        println("Team $i = ${teamGroup.get(i)}")
    }

}