package LP4_09_AbstractInterfacesAndSmartCast

class Director(name: String, age: Int) : Worker(name, age) {
    override fun work() {
        println("Управляю процессом")
    }


}