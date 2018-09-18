package forma

abstract class Forma {

    abstract val area: Double

    abstract val perimetro: Double

    fun avg(a: Double, b: Double) = (a + b)/2

    override fun toString() = "Forma [Area=" + this.area + ", Perimetro=" + this.perimetro + "]"

    //override fun toString(): String {
        //return "Forma [Area=" + this.area +
      //          ", Perimetro=" + this.perimetro + "]"
    //}

}
