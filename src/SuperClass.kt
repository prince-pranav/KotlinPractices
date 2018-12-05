open class SuperClass(str: String) : Person {

    val superStr = str

    open fun printMessage(str: String) {
        println("This is superClass function: $str")
    }

    override fun getJobInfo(name: String, jobType: String) {
        println("$name is working as $jobType")
    }
}