fun main(args: Array<String>) {

    val nullValue: String? = null
    val lengthOfValue: Int? = nullValue?.length
    println("nullValue is $nullValue")

    val someValue = "May be null or not"
    val lengthOfSomeValue: Int? = someValue?.length
    println("length Of Some Value is $lengthOfSomeValue")

    if (lengthOfValue == null) {
        println("length of value is $lengthOfValue")
    }

    val l2 = lengthOfValue ?: 11
    println("l2 is null or $l2")

    try {
        val l3 = lengthOfValue!!
        println("l3 is null or $l3")
    } catch (e: KotlinNullPointerException) {
        println("l3 is null or null")
    }
}