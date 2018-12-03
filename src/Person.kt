data class Person(
    var first_name: String?,
    var age: Int?,
    var last_name: String?
) {

    init {
        first_name = "Mr. $first_name"
    }

    var fname = first_name
        get() = field ?: first_name
        set(value) {
            field = value + "haha"
        }

    constructor(first_name: String?, last_name: String) : this(first_name, null, last_name)

}