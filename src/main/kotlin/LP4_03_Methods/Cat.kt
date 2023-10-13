package LP4_03_Methods

class Cat(val name: String, var age: Int, val weight: Float = 0F) {
    val isOld: Boolean
        get() = age >= 12

    fun printInfo() {
        println("Кличка: $name, Возраст: $age, Вес: $weight")
    }

//    fun isOld() = age >= 12
}