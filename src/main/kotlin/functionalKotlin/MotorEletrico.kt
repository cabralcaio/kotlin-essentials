package functionalKotlin

class MotorEletrico : Motor() { // heritage

    private var nivelBateria: Int = 1

    override fun temAutonomia(): Boolean {
        return nivelBateria > 0
    }

    override fun gastando() { // o override nesse caso esta sobrescrevendo a função abstrata da classe Motor
        nivelBateria --
        println("Gastando energia, nivel agora é: ${nivelBateria}")
    }

}