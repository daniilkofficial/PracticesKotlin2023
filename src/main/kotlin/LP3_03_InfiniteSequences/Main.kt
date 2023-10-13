package LP3_03_InfiniteSequences

fun main() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee №$it" }
//    val first30 = employees.take(30)
//    val first30 = employees.takeLast(30) // с конца
//    val first30 = employees.drop(30) // противоположный take, выбрасывает первые 30
    val first30 = employees.drop(30) // выбрасывает последние 30
    for (employee in first30) {
        println(employee)
    }

    println()
    // Бесконечные последовательности
    // бесконечный массив четных чисел и выведем первые 10
    val arrayInfinite = generateSequence(0) {
        println("Сгенерировано: ${it + 2}")
        it + 2
    } // 0+2, 1+2, n+2 ...
    // Ленивая инициализация
    // предпологает что при отсувии элементов
    // нет необходимости создавать или делать больше элементов
    // а нужно создавать только при необходимости и запросе большого кол-ва
    // При обращении будет расширяться массив в зависимости от недостаточности элементов (получении необходимых)
    val eventList = arrayInfinite.take(100)
    for (i in eventList) {
        println(i)
    }

    val arrayInfiniteString = generateSequence('A') {
        println("Сгенерировано: ${it + 2}")
        it + 1
    }
    val eventListString = arrayInfiniteString.take(10) // при более 24 будет символы
    for (i in eventListString) {
        println(i)
    }

    val arrayInfiniteRandom = generateSequence {
        (Math.random() * 100).toInt()
    }

    val eventListRandom = arrayInfiniteRandom.take(10)

    for (i in eventListRandom) {
        println(i)
    }

    println()
    // Задача
    val arrayEmployees = generateSequence("Сотрудник №1") {
        val index = it.substring(11).toInt()
        "Сотрудник №${index + 1}"
    }
    val listOfFirst = arrayEmployees.take(100)
    for (employee in listOfFirst) {
        println(employee)
    }

}