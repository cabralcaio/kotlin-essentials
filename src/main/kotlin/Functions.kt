fun square(x: Double): Double {
    return x * x
}
fun add(a: Int, b: Int): Int = a + b

// Top-level function
fun double(i: Int) = i * 2
class A {
    // Member function (method)
    private fun triple(i: Int) = i * 3
    // Member function (method)
    fun twelveTimes(i: Int): Int {
        // Local function
        fun fourTimes() = double(double(i))
        return triple(fourTimes())
    }
}
// Top-level function


fun concatenate(vararg strings: String): String {
// The type of `strings` is Array<String>
    var accumulator = ""
    for (s in strings) accumulator += s
    return accumulator
}
fun sum(vararg ints: Int): Int {
// The type of `ints` is IntArray
    var accumulator = 0
    for (i in ints) accumulator += i
    return accumulator
}

fun cheer(how: String = "Hello,", who: String = "World") {
    println("$how $who")
}

fun main() {
    println(square(10.0)) // 100.0
    println(add(2,3)) //5

    println(double(1)) // 2
    println(A().twelveTimes(2)) // 24

    println(listOf(1, 3, 5, 6)) // [1, 3, 5, 6]
    println(listOf("A", "B", "C")) // [A, B, C]

    println(concatenate()) //
    println(concatenate("A", "B")) // AB
    println(sum()) // 0
    println(sum(1, 2, 3)) // 6

    val list = listOf(1, 2, 3, 4)
    println(list.joinToString()) // 1, 2, 3, 4
    println(list.joinToString(separator = "-")) // 1-2-3-4
    println(list.joinToString(limit = 2)) // 1, 2, ...

    cheer() // Hello, World
    cheer("Hi") // Hi World
}