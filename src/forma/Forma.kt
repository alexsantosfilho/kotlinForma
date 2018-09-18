package forma

abstract class Forma {

    abstract val area: Double

    abstract val perimetro: Double

    override fun toString() = "Forma [Area=" + this.area + ", Perimetro=" + this.perimetro + "]"

    //override fun toString(): String {
        //return "Forma [Area=" + this.area +
      //          ", Perimetro=" + this.perimetro + "]"
    //}

}
