package LP3_02_FunctionsFilterAndMap

fun main() {
    // FILTER
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers) {
        println(i)
    }
    println()


    // Задача
    val names = listOf("Иван", "Андрей", "Алексей", "Ирина")
    val namesStartsFromA = names.filter { it.startsWith("А") }
    for (name in namesStartsFromA) {
        println(name)
    }

    println()
    // MAP
    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { it * 2 }
    for (i in doubledNumbers) {
        println(i)
    }

    println("Map преоразование")
    val employees = numbers.map { "Employee №$it" }
    for (employee in employees) {
        println(employee)
    }

    println("Сортировка")
    val array2 = arrayOf(8, 10, -6, 45, 51)
//    val sortedArray = array2.sorted() // по возрастанию
    val sortedArray = array2.sortedDescending() // по убыванию
    for (i in sortedArray) {
        println(i)
    }

    println("\nДЗ:")
    // ДЗ
    val initArray = mutableListOf<Int>()
    for (i in 0..<1000) {
        initArray.add((Math.random() * 1000).toInt())
    }
    val result = initArray
        .filter { it % 5 == 0 || it % 3 == 0 }
        .map { it * it }
        .sortedDescending()
        .map { "$it" }
    for (i in result) {
        println(i)
    }

}