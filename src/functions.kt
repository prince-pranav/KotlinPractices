fun main(args: Array<String>) {

    var num1 = 20
    var num2 = 10

    var result = addTwoNumbers(num1, num2)
    println("Result is $result")

    var result2 = calculation(operation = "-", param1 = num1, param2 = num2)
    println("Result is $result2")
}

fun addTwoNumbers(param1: Int, param2: Int): Int {
    return param1 + param2
}

fun calculation(param1: Int, param2: Int, operation: String = "+"): Int {
    if (operation.equals("+")) {
        return param1 + param2
    } else if (operation.equals("-")) {
        return param1 - param2
    } else {
        return 0
    }
}
