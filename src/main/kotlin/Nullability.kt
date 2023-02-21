fun main() {
    // var person: Person  COMPILATION ERROR,
    // the property needs to be initialized

    //var person: Person = null COMPILATION ERROR,
    // Person is not a nullable type, and cannot be `null`

    var person: String? = null // OK

    class User(val name: String) {
        fun cheer() {
            println("Hello, my name is $name")
        }
    }
    var user: User? = null

        user?.cheer() // (does nothing)
        println(user?.name) // null
        user = User("Cookie")
        user?.cheer() // Hello, my name is Cookie
        println(user?.name) // Cookie


    var user3: User? = User("Cookie")

        println(user3!!.name.length) // 6
        user3 = null
        //println(user3!!.name.length) // throws NullPointerException



    //smart casting
    fun printLengthIfNotNull(str: String?) {
        if (str != null) {
            println(str.length) // str smart-casted to String
        }
    }

    fun printLengthIfNotNullOrThrow(str: String?) {
        requireNotNull(str) // str smart-casted to String
        println(str.length)
    }


    //elvis operator
    fun main() {
        println("A" ?: "B") // A
        println(null ?: "B") // B
        println("A" ?: null) // A
        println(null ?: null) // null
    }

    fun printName(user: User?) {
        val name: String = user?.name ?: "default"
        println(name)
    }

        printName(User("Cookie")) // Cookie
        printName(null) // default

}