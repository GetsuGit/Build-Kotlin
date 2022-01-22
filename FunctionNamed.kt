fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Helo $firstName $middleName $lastName")
}

fun main() {

    fullName("Getsu", "Coding", "Design")

    fullName(
        lastName = "Design",
        firstName = "Getsu",
        middleName = "Coding"
    )
}