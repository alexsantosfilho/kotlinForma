package forma

class Quadrado(lado: Double) : Forma() {

    private val lado = lado

    override val area
        get() = this.lado * this.lado

    override val perimetro: Double
        get() = 4 * this.lado

    }
