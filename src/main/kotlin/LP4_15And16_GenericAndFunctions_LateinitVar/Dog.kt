package LP4_15And16_GenericAndFunctions_LateinitVar

class Dog {
    private lateinit var a: String // поздняя инициализация

    fun printA() {
        println(a)
        println(a.length)
    }
}