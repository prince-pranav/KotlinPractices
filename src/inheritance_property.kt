fun main(args: Array<String>) {

    val sup = SuperClass("Super Class")
    val sub = SubClass("Sub Class")
    sup.printMessage(sup.superStr)
    sub.printMessage(sub.strMessage)

    sup.getJobInfo("pranav", "Software developer")


    val salary = { name: String, jobType: String ->
        println("$name is working as $jobType")
    }
    salary("pranav", "Software developer")

    val result = { num1: Int, num2: Int ->
        println("Final result is ${num1.plus(num2)}")
    }
    result(4, 3)

    val printMsg: ()->Unit = {
        println("My name is pranav")
    }
    printMsg()

}


