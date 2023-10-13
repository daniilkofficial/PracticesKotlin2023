package LP4_08_Inheritance

open class Worker(val name: String, val age: Int) {
    open fun work(){
        println("Работаю...")
    }
}