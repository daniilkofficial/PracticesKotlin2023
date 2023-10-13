package LP3_01_AnonymousOrLambda

fun main() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(2, 10))

    // Задача
//    val square: (Int) -> Int = { a -> a * a }
    val square: (Int) -> Int = { it * it }
    println(square(4))

    // Задача 1
    val perimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
    println(perimeter(10, 5))

    // Задача 2
    val sayHello: (String) -> Unit = { println("Привет, $it!") }
    sayHello("Андрей")

    // Задача 3
    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }


    val sortedArray = sort(arrayOf(5, 9, -8, 6, 85, 1))
    for(i in sortedArray){
        println(i)
    }
}