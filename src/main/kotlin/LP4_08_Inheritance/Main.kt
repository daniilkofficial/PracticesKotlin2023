package LP4_08_Inheritance

fun main() {
    val dog = Dog(3f)
    println(dog.habitat)

    // ДЗ
    val workers = mutableListOf<Worker>()
    workers.add( Worker("Vasay", 22))
    workers.add( Worker("Ivan", 32))
    workers.add( Worker("Petay", 34))
    workers.add( Worker("Katy", 25))
    workers.add(Programmer("Joch", 24, "Java"))
    workers.add(Programmer("Dima", 21, "Kotlin"))
    for (worker in workers) {
       worker.work()
    }
}
