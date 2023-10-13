package LP3_04_FunctionZip

fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..1000) {
        names.add("Имя$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    // создается коллекция Pair (first, second) пара первого и второго (последущего элемента)
    val users = names.zip(phones)
    for (user in users) {
        println("Имя: ${user.first} Телефон: ${user.second}")
    }

    println()
    // Задача
    val fullNames = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames.add("Имя$i Фамилия$i")
    }
//    val namesTask = fullNames.map { it.substringBefore(" ") }
//    val lastNames = fullNames.map { it.substringAfter(" ") }
//    val usersTask = namesTask.zip(lastNames)
    val usersTask = fullNames.map { Pair(it.substringBefore(""), it.substringAfter("")) }

    for (user in usersTask) {
        println("Имя: ${user.first} Фамилия: ${user.second}")
    }


}