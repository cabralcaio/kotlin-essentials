package functionalKotlin

class MotorCombustao: Motor() { // heranca
    private var nivelCombustivel: Int = 2

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }

    override fun gastando() {
        nivelCombustivel --
        println("Gastando combustivel, nivel agora é: ${nivelCombustivel}")
    }
}