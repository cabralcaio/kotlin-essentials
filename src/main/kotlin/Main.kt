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
}