package LP2_10_Functions

fun main() {
    println(max(5, 10))
    println(crop("qwerty"))
    println(crop("qwe"))
    println(sum())
    println(sum(1, 2, 3, 4, 5))

    // ДЗ+
    // Написать метод sort, который возращает коллекцию чисел в отсортированном виде
    // Тип возвращаемой коллекции должен быть неизменяемым (List).
    // В качестве параметра массив может принимать коллекцию, массив или аргументы переменной длины.
    // Если передаваемая коллекция содержит одинаковые элементы, то они должны сохраниться.
    println("\nДомашнее задание:")
//    val numbers = mutableListOf(5, 8, 12, -2, 6, 5)
    val numbers = arrayOf(5, 8, 12, -2, 6, 5)
//    val result = sort(8, -6, 5, 88, 9, 10)
    val result = sort(numbers)
    for (i in result) {
        println(i)
    }

}

fun max(a: Int, b: Int) = if (a > b) a else b
fun crop(str: String) = str.substring(0, Math.min(5, str.length))

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}


fun sort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())