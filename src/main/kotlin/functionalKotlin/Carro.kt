package functionalKotlin

class Carro (
    private val motor: Motor
        ) {
    var cor: String? = null

    fun partida() {
        println("Ligando o carro...")
        motor.ligar()
    }

    fun desligar() {
        println("Desligando o carro...")
        motor.desligar()
    }

    fun anda() {
        when {
            !motor.estaLigado() -> println("Primeiro ligue o carro")
            !motor.temCombustivel() -> {
                println("Coloque combustível")
                motor.desligar()
            }
            else -> {
                println("Carro andando: Vrrrrunnnn")
                motor.gastandoCombustivel()
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