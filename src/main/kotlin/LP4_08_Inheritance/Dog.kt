package LP4_08_Inheritance

class Dog(weight: Float) : Animal("Собака", weight, "Суша") {
    override fun eat(){
        println("Кушаю кость")
    }
}