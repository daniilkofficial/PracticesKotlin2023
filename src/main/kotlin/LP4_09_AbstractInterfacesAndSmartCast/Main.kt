package LP4_09_AbstractInterfacesAndSmartCast


fun main() {
    val workers = mutableListOf<Worker>()
    workers.add(Seller("Vasay", 22))
    workers.add(Seller("Ivan", 32))
    workers.add(Seller("Petay", 34))
    workers.add(Seller("Katy", 25))
    workers.add(Programmer("Joch", 24, "Java"))
    workers.add(Programmer("Dima", 21, "Kotlin"))
    workers.add(Director("Nik", 50))

    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }

    for (worker in workers) {
        worker.work()
//        worker as Cleaner // приведение
//        worker.clean()
        if (worker is Programmer) { // проверка и преведение внутри
            println(worker.language)
        }
        if (worker is Cleaner) { // проверка и преведение внутри
            worker.clean()
        }
    }
    println()

    for (cleaner in cleaners) {
        cleaner.clean()
    }
}
