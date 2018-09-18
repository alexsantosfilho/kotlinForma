import forma.*

internal object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val formas = arrayOfNulls<Forma>(4)
        formas[0] = Retangulo(3.0, 4.0)
        formas[1] = Trapezio(32.0, 4.0, 2.0, 1.0, 1.0)
        formas[2] = Quadrado(5.0)
        formas[3] = Circulo( 5.0)

        println("Formas calculadas:")
        for (forma in formas)
            println(" - $forma")
    }

}
