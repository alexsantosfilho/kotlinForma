package forma

class Circulo(raio: Double) : Forma() {

    private val raio = raio

    override val area = Math.PI * Math.pow(this.raio, 2.0)

    override val perimetro = 2.0 * Math.PI * this.raio

}
