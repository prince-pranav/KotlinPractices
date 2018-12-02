import Operation.*

fun main(args: Array<String>) {

    var mathFun = MathFun()

    print("Add 1st value : ")
    val val1: Int? = MathFun.getValue()
    print("Add 2nd value : ")
    val val2: Int? = MathFun.getValue()

    print("Operation(+ - * /) : ")
    var opr: String? = readLine()

    var result: Int? =
        when (opr) {
            ADD.opr -> mathFun.addValues(val1, val2)
            SUBTRACT.opr -> mathFun.minusValues(val1, val2)
            MULTIPLY.opr -> mathFun.multiplyValues(val1, val2)
            DIVIDE.opr -> mathFun.divideValues(val1, val2)
            else -> throw Exception("Unknown Operation")
        }
    println("Final result is $result")
}