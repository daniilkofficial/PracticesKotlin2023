package LP3_06_ControlWorkOnCollections

fun main() {
    val data = mapOf(
        "Январь" to listOf(200, 100, 400, 300),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300),
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filterNot { it.value.any { it < 0 } }
    val averageWeek = validData.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageMonth = listOfSum.average()

    val maxMonths = validData.filter { it.value.sum() == max }.keys
    val minMonths = validData.filter { it.value.sum() == min }.keys


    println("Средняя выручка в месяц: $averageMonth")
    println("Максимальная выручка в месяц: $max")
    print("Была в следующих месяцах: ")
    for (month in maxMonths) {
        print("${month} ")
    }

    println("\nМинимальная выручка в месяц: $min")
    print("Была в следующих месяцах: ")
    for (month in minMonths) {
        print("$month ")
    }

    val invalidData = data.filter { it.value.any { it < 0 } }
    val errorMonth = invalidData.keys
    print("\nОшибки произошли в следующих месяцах: ")
    for (month in errorMonth) {
        print("$month ")
    }

}
