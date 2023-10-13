package LP4_03_Methods

fun main() {
    val cat = Cat("Барсик", 12, 3F)
    cat.printInfo()
    println(cat.isOld)
    cat.age = 10
    println(cat.isOld)

    println()
    // ДЗ
    val worker = Worker("Вася","Директор",2010)
    worker.printInfo()
    worker.working()
    println(worker.experience)
}

fun Worker.printInfo() {
    println("$name, $post - $year ($experience лет в компании)")
}

//fun Cat.isOld() = age >= 12