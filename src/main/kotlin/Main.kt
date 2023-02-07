fun main(args: Array<String>) {
    println("Hello, World! I'm Caio.")

    val a = 26
    var b = "ABC"
    // Kotlin is smart enough to infer the type from the value that is set.


    println(a) // the result must be 26
    println(b) // the result must be ABC (string)
    // a = 23 it's not possible because a cannot be reassigned as I started using val (value not variable)
    b = "CDE"
    println(b) // CDE

    val f: Int // declare without initialize (must be avoided)
    f = 2

    var longNumber = 42L // create a variable using type long
    var floatNumber = 15.3F // create a variable using type float


    //If we need to explicitly convert one number to another type,
    //we use explicit conversion functions like toInt or toLong.
    val l: Long = 123L
    var i: Int = 123
    val c: Byte = 123

    val i1: Int = c.toInt()
    val i2: Int = l.toInt()
    val l1: Long = c.toLong()
    val l2: Long = i.toLong()


    val million = 1_000_000 // underscore is ignored
    println(million) // 1000000


    //basic operations
    val j1 = 12
    val j2 = 34
    println(j1 + j2) // 46
    println(j1 - j2) // -22
    println(j1 * j2) // 408
    println(j1 / j2) // 0
    val d1 = 1.4
    val d2 = 2.5
    println(d1 + d2) // 3.9
    println(d1 - d2) // -1.1
    println(d1 * d2) // 3.5
    println(d1 / d2) // 0.5599999999999999


    //Beware that when we divide an Int by an Int, the result is also
    //Int, so the decimal part is lost.
    println(5 / 2) // 2, not 2.5
    println(5.toDouble() / 2) // 2.5

    // Post-incrementation i = 1
    // increments value and returns the previous value
    println(i++) // 1
    println(i) // 2
    // Pre-incrementation
    // increments value and returns the new value
    println(++i) // 3
    println(i) // 3
    // Post-decrementation
    // decrements value and returns the previous value
    println(i--) // 3
    println(i) // 2
    // Pre-decrementation
    // decrements value and returns the new value
    println(--i) // 1
    println(i) // 1

    //Operations on bits
    println(0b0101 and 0b0001) // 1, that is 0b0001
    println(0b0101 or 0b0001) // 5, that is 0b0101
    println(0b0101 xor 0b0001) // 4, that is 0b0100
    println(0b0101 shl 1) // 10, that is 0b1010
    println(0b0101 shr 1) // 2, that is 0b0010


    val b1: Boolean = true
    println(b1) // true
    val b2: Boolean = false
    println(b2) // false

    //Equality
    println(10 == 10) // true
    println(10 == 11) // false
    println(10 != 10) // false
    println(10 != 11) // true

    //type Char
    println('A'.code) // 65 - find the unicode of a char


    //string
    val text1 = "Let\'s say:\n\"Hooray\""
    println(text1)
    // Let's say:
    // "Hooray"
    val text2 = """Let\'s say:\n\"Hooray\""""
    println(text2)
    // Let\'s say:\n\"Hooray\"

    val text = """
    Let's say:
    "Hooray"
    """.trimIndent()
        println(text)
    // Let's say:
    // "Hooray"
        val description = """
    A
    B
    C
    """.trimIndent()
        println(description)
    // A
    // B
    // C


    //Concatenated
    val name = "Cookie"
    val surname = "DePies"
    val age = 6
    val fullName = "$name $surname ($age)"
    println(fullName) // Cookie DePies (6)
    val fullNameUpper = "${name.uppercase()} ${surname.uppercase()} ($age)"
    println(fullNameUpper) // COOKIE DEPIES (6)


}