package functionalKotlin

fun main() {

    val motorCombustao = MotorCombustao()
    val fusca = Carro(motorCombustao)

    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)

    fusca.partida()
    fusca.anda()
    fusca.anda()
    fusca.anda()

    tesla.partida()
    tesla.anda()
    tesla.anda()
}