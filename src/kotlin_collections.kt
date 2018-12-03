fun main(args: Array<String>) {

    // Array,List,Set,Map are collection in Kotlin
    // Only mutable connection add and remove value

    // Array
    var sampleStrArray = arrayOf<String>("Pranav", "Nipam", "Raja", "Zalak")
    var sampleAnyArray = arrayOf<Any>("Pranav", "Nipam", "Raja", 29)

    sampleStrArray[3] = "Kenam"

    for (person in sampleStrArray) {
        println("This is person : $person")
    }

    val nullArray = arrayOfNulls<String>(2)
    nullArray.set(1, "pranav")
    nullArray.set(0, "nipam")
    for (person in nullArray) {
        println("This is person : $person")
    }


    //List

    val sampleStrList = listOf<String>("A", "B", "C", "D")
    val sampleStrMutableList = mutableListOf<String>("A", "B", "C")

    sampleStrMutableList.add(2, "E")

    for (letter in sampleStrMutableList) {
        println("Capital letter is $letter")
    }


    //Set (Go and check difference between set and list)

    val sampleSet = setOf<String>("A", "B", "C", "D")
    val sampleMutableSet = mutableSetOf<String>("A", "B", "C", "D")

    //Map

    val sampleMap = mutableMapOf<String, Int>(
        Pair("pranav", 25),
        Pair("Nipam", 25)
    )

    sampleMap.put("kenam", 10)

    for ((name: String, age: Int) in sampleMap) {
        println("Age of $name is $age")
    }

    //Exercise

    val personDetail = mutableMapOf<Person, Int>(
        Pair(Person("Pranav", "Patel", 1000), 5),
        Pair(Person("Nipam", "Patel", 2000), 3)
    )

    for ((person: Person, total_days: Int) in personDetail) {
        println("Total salary of ${person.first_name} is $${person.daily_salary?.times(total_days)}")
    }
}