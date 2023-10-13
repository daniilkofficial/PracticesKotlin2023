package LP4_08_Inheritance

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Кушать еду")
    }

   open fun run() {
        println("Бегу")
    }
}