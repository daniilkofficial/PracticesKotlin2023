package LP2_09_Cycles

fun main() {
    val array = arrayOf(1, 5, 3, 6, 5, 5)
    for (i in array) {
        println(i)
    }
    val arrayNum = arrayOfNulls<Int>(101)
    for (i in 0 until arrayNum.size) {
        arrayNum[i] = i
    }
    for (i in arrayNum) {
        println(i)
    }

    for (i in 100 downTo 0 step 2) { // с конца, с шагом 2
        println(i)
    }

    println("\nЗадача")
    // Задача
    // Создайте массив чисел от 0 до 100
    val arrayNum1 = arrayOfNulls<Int>(101)
    for (i in 0 until arrayNum1.size) {
        arrayNum1[i] = i
    }

    for (i in arrayNum1) {
        println(i)
    }

    println("Дополнительно")
    for ((index, i) in arrayNum1.withIndex()) {
        arrayNum1[index] = i?.times(2)

    }

    for (i in arrayNum1) {
        println(i)
    }

//    do {
//
//    }while (true)

    println("\nДомашнее задание")
    // ДЗ
    // 1) Создайте массив чисел от 300 до 600
    // 2) Выведите на экран в порядке убывания все значения массива,
    // которые без остатка делятся на 5
    // В итоге в консоли должны быть значения: 600, 595, 590, ...
    // Подсказка: withIndex() можно вызвать у диапазонов, например (0..100).withIndex()
    val arrayN = arrayOfNulls<Int>(301)
    for ((index, i) in (300..600).withIndex()) {
        arrayN[index] = i
    }

    for (i in arrayN.size - 1 downTo 0 step 5) {
        println(arrayN[i])
    }
}