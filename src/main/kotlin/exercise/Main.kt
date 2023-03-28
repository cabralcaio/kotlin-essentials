package exercise

fun main() {
    var cliente1 = Cliente()
    cliente1.nome = "Caio"
    cliente1.idade = 23
    cliente1.peso = 68.5

    println("Ola ${cliente1.nome} sua idade eh ${cliente1.idade} e seu peso eh ${cliente1.peso}")
}