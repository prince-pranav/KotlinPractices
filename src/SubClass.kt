open class SubClass(str: String) : SuperClass(str) {
    val strMessage = str

    override fun printMessage(str: String) {
        super.printMessage("But i add subclass string here")
    }
}
