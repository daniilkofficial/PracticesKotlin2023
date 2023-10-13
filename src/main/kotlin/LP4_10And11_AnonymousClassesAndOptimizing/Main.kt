package LP4_10And11_AnonymousClassesAndOptimizing

fun main() {
    val car: Transport = Car()
    val bicycle: Transport = Bicycle()
//    if (car !is Car) return
    if (car is Car && car.startEngine())
        car.name = "Машина 2"
//    if (car is Car || car.startEngine())
//    if (car !is Car || car.startEngine())

    println(car.name)

    // Анонимные классы
    println()
    travel(object : Transport("Автобус") {
        override fun drive() {
            println("$name едет...")
        }
    })

    // ДЗ
    val sportsman = Sportsman()
    sportsman.invokeWaterBoy(object : WaterBoy {
        override fun bringWater() {
            println("Вода принесена!")
        }

    })

    // Оптимизация
    println()
    sportsman.invokeWaterBoy { println("Вода принесена!")}
}

fun travel(transport: Transport) {
    transport.drive()
}