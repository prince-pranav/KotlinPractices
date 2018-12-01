import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val strArray = arrayOf("House", "Apartment", "Villa", "Hotel")
    val intArray = intArrayOf(1, 2, 3, 4, 5)

    var count = 0

    //for loop
    for (values in strArray) {
        println(values)
    }

    for (values in intArray) {
        println(values)
    }

    //for loop with indies
    for (i in strArray.indices) {
        println(strArray[i])
    }

    for (i in intArray.indices step 3) {
        println(intArray[i])
    }

    for (i in 0 until intArray.size) {
        println(intArray[i])
    }


    // while loop
    while (count < strArray.size) {
        println(strArray[count])
        println(count)
        count++
    }

    //Do loop
    count = 0
    do {
        println("Type = ${strArray.get(count)}")
        count++
    } while (count < strArray.size)

    //try-catch block
    try {

        print("please add value 1 for sum : ")
        val value1: String? = readLine()
        val intValue1 = value1!!.toInt()

        print("please add value 2 for sum : ")
        val value2: String? = readLine()
        val intValue2 = value2!!.toInt()

        val sum = intValue1 + intValue2
        println("Result is $sum")
    } catch (e: KotlinNullPointerException) {
        println("please enter any value")
    } catch (e: NumberFormatException) {
        println("Only number allow")
    }

}