package functionalKotlin

fun main() {

    val motor = Motor()
    val carro = Carro(motor)
    carro.anda()
    carro.cor = "Amarelo"
    carro.partida()
    carro.anda()
    carro.anda()
    carro.anda()
}