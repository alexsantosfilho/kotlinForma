package forma

class Trapezio(baseMaior: Double, baseMenor: Double, altura: Double, ladoEsquerdo: Double, ladoDireito: Double) : Forma() {

    private val baseMaior = baseMaior
    private val baseMenor = baseMenor
    private val lados = doubleArrayOf(0.0, 0.0)
    private val altura = altura
    private val ladoDireito = ladoDireito
    private val ladoEsquerdo = ladoEsquerdo

    override val area = (this.baseMenor + this.baseMaior) * this.altura / 2

    override val perimetro = this.baseMenor + this.baseMaior + this.lados[0] + this.lados[1]

}
