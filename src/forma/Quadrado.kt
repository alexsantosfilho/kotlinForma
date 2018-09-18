package forma

class Quadrado(lado: Double) : Forma() {

    private val lado = lado

    override val area = this.lado * this.lado

    override val perimetro: Double = 4 * this.lado

    }
