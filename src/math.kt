fun main(args: Array<String>) {
    var num1 = 10
    var num2 = 20
    var num3 = 10

    //calculations(We can directly use +,-,*,/ sign for calculation)

    var resultSum = num1.plus(num2)
    var resultDiff = num1.minus(num2)
    var resultMulti = num1.times(num2)
    var resultDiv = num1.div(num2)
    println("Results are \n $resultSum \n $resultDiff \n $resultMulti \n $resultDiv")


    //comparison
    var result = num1.compareTo(num2)
    var result2 = num2.compareTo(num1)
    var result3 = num3.compareTo(num1)
    var result4 = num1 == num2
    var result5 = num1 == num3
    println("Results are \n $result \n $result2 \n $result3 \n $result4 \n $result5")

    //increment decrement

    num1++ // use inc() function as well
    println("Increment :  $num1")

    num1--
    println("Decrement : $num1")
}