package functionalKotlin

class Carro (
    private val motor: Motor
        ) {
    var cor: String? = null

    fun partida() {
        motor.ligar()
    }

    fun desligar() {
        motor.desligar()
    }

    fun anda() {
        when {
            !motor.estaLigado() -> println("Primeiro ligue o carro")
                !motor.temAutonomia() -> {
                    when (motor) {
                        is MotorEletrico -> println("Carregue a bateria")
                        is MotorCombustao -> println("Coloque combustível")
                    }
                    motor.desligar()
            }
            else -> {
                when (motor) {
                    is MotorEletrico -> println("Carro andando")
                    is MotorCombustao -> println("Carro andando: Vrrrummmmm")
                }
                motor.gastando()
            }
        }
    }

    fun freia() {
        println("Freiando o carro")
    }

    fun buzina() {
        println("biiiii")
    }
}