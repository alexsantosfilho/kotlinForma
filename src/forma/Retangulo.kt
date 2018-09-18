package forma

class Retangulo(base: Double, altura: Double) : Forma() {

    private val base = base
    private val altura = altura

    override val area: Double = this.base * this.altura

    override val perimetro: Double = 2 * (this.base + this.altura)

}
