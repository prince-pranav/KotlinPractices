class MathFun {
    companion object {

        fun getValue(): Int? {
            val addedValue: String? = readLine()
            return addedValue?.toInt()
        }


    }

    fun addValues(val1: Int?, val2: Int?): Int? {
        var val3: Int? = val1!!.plus(val2!!)
        return val3
    }
    fun minusValues(val1: Int?, val2: Int?): Int? = val1!!.minus(val2!!)
    fun multiplyValues(val1: Int?, val2: Int?): Int? = val1!!.times(val2!!)
    fun divideValues(val1: Int?, val2: Int?): Int? = val1!!.div(val2!!)

}