package functionalKotlin

abstract class Motor { // needs to be open for heritage
    private var ligado: Boolean = false

    fun ligar() {
        println("Ligando o carro...")
        ligado = true
    }

    fun desligar() {
        println("Desligando o carro...")
        ligado = false
    }

    fun estaLigado(): Boolean {
        return ligado
    }

    abstract fun temAutonomia(): Boolean

    abstract fun gastando()
}