fun main(args: Array<String>) {

    print("Enter your capital name : ")

    var capital: String? = readLine()

    if (capital == "Gandhinagar") {
        println("Your state is Gujarat")
    } else if (capital == "Mumbai") {
        println("Your state is Maharastra")
    } else {
        println("I dont know this state")
    }


    var state: String?
    when (capital) {
        "Gandhinagar" -> state = "Gujarat"
        "Mumbai" -> state = "Maharastra"
        else -> state = "Unknown"
    }
    println("Your state is $state")
}