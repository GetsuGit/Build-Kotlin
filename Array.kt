fun main() {

    val members: Array<String> = arrayOf("Getsu", "Code")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balance: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println("Hasil index member : " + members[0])
    println("Hasil index value : " + values[0])
    println("Hasil index balance : " + balance[2])

    // untuk mengganti nilai array

    members.set(0, "Rifki")
    println("Member : " + members[0])

    // array null
    val members1: Array<String?> = arrayOfNulls(5)
    println("Array null member : " + members1[0])

    // membuat anggota array
    val anggota: Array<String?> = arrayOfNulls(5)

    anggota[0] = "AA"
    anggota[1] = "BB"
    anggota[2] = "CC"
    anggota[3] = "DD"
    anggota[4] = "EE"

    println("Anggota array : " + anggota[1])

}