fun main() {
    if (true) {
        println("verdade")
    }

    //One of Kotlin’s superpowers is that an if-else statement can be
    //used as an expression20, therefore it produces a value.
    val value = if (true) {
    // body 1
    } else {
    // body 2
    }

    //Examples
    var isOne = true
    val number1: Int = if (isOne) 1 else 0
    println(number1) // 1
    isOne = false
    val number2: Int = if (isOne) 1 else 0
    println(number2) // 0
    val superuser = true
    val hasAccess: Boolean = if (superuser) {
        println("Good morning, sir Admin")
        true
    } else {
        false
    }
    println(hasAccess) // true


    //basic if
    var one = true
    val r1: Int = if (one) 1 else 0 // as ternary on JS and Java
    // a more readable alternative to
    val r2: Int = if (one) {
        1
    } else {
        0
    }

    val user = "caio"
    val name = if (user == null) "" else user // user.name


    //when statement
    println("Is it going to rain?")
    val probability = 70
    when {
        probability < 40 -> println("Na-ha")
        probability <= 80 -> println("Likely")
        probability < 100 -> println("Yes")
        else -> println("Holly Crab")
    }

    // expression
    val text = when {
        probability < 40 -> "Na-ha"
        probability <= 80 -> "Likely"
        probability < 100 -> "Yes"
        else -> "Holly Crab"
    }
    println(text) // likely


    //when-statement with a value
    val magicNumbers = listOf(7, 13)
    fun describe(a: Any?) {
        when (a) {
            null -> println("Nothing")
            1, 2, 3 -> println("Small number")
            in magicNumbers -> println("Magic number")
            in 4..100 -> println("Big number")
            is String -> println("This is just $a")
            is Long, is Int -> println("This is Int or Long")
            else -> println("No idea, really")
        }
    }

    describe(null) // Nothing
    describe(1) // Small number
    describe(3) // Small number
    describe(7) // Magic number
    describe(9) // Big number, because 9 is in range from 4 to 100

    //Kotlin does not support switch-case statements because we use the when-statement instead.


    //is check
//    println(123 is Int) // true
//    println("ABC" is String) // true
//    println(123 is String) // false
//    println("ABC" is Int) // false
//    println(123 !is String) // true
//    println("ABC" !is Int) // true


}