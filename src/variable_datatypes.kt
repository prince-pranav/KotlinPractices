fun main(args: Array<String>) {

    var myDeclaredVariable: String

    var myName = "prince"
    val myAge = 25

    myName = "pranav"
    println("My name is $myName and i am $myAge years old")


    // data types of kotlin
    val myInt: Int = 123
    val myDouble: Double = 123.0
    val myFloat: Float = 12.0F
    val myLong: Long = 12L
    val myShort: Short = 1
    val myByte: Byte = 1

    val myString: String = "String"
    val myBoolean: Boolean = true

    val myArray: Array<String> = arrayOf("A", "B", "C", "D", "E")
    var firstString = myArray[0]
    println("first string in array is $firstString")

    // there is char data types available in kotlin

    val myNullableVariable: Int? = null
    println("Nullable variable is $myNullableVariable")

    //Constant Variable
    println("Color is ${Constants.RED}")
}