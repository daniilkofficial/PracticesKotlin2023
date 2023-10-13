package LP3_05_FunctionFlatMap

fun main() {
    val revenueByWeek = listOf(
        listOf(8, 6, 5, 1, 2),
        listOf(4, 7, 5, 8, 2),
        listOf(8, 7, 5, 1, 2),
        listOf(8, 5, 5, 1, 2)
    )
//    val total = mutableListOf<Int>()
//    revenueByWeek.map { // из списка пречислением добавляется в изменяемый список
//        for (i in it) {
//            total.add(i)
//        }
//    }

    //   val total = revenueByWeek.flatMap { it }  // неотличается что внизу
    val total = revenueByWeek.flatten() // на выходе массив чисел, не изменяемый и сразу число (без цикла)

    val average = total.average()
    println(average)

    println()
    // Коллекция Map
    val data = mapOf(
        "file1" to listOf(15, 20, 45, 15, 12),
        "file2" to listOf(35, -20, 45, 15, 12),
        "file3" to listOf(15, 40, 45, 15, 72)
    )

//    val data = mapOf(Pair( "file1", listOf(15, 20, 45, 15, 12)))

//    data["file1"] = listOf(15, 20, 45, 15, 12)
//    data["file2"] = listOf(35, 20, 45, 15, 12)
//    data["file3"] = listOf(15, 40, 45, 15, 72)

    val averageOfMap = data
        .filter {
            it.value.all {
                it >= 0 // Any не учитывает весь список а если хотя бы 1 и игнорируется
            }
        }
        .flatMap { it.value }
        .average()
    println(averageOfMap)

}