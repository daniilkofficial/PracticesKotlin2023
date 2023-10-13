package LP2_07_Collections

fun main() {
    val array1: ArrayList<Int> = arrayListOf(1, 2, 3, 5, 10, 52)
    array1[4] = 10
//    array[4] = null // не стоит Null'лабел тип, нужно добавить в arrayListOf() или в типе  ArrayList<Int?>
    println(array1[4])

    val array2 = arrayOfNulls<Int>(10)

    val listOfNumbers1: MutableList<Int> = ArrayList<Int>()
    // List, Set и Map - не изменяемые в отличии от Java
    listOfNumbers1.add(5)
    println(listOfNumbers1.get(0))
    println(listOfNumbers1[0])
//    methodOfList(listOfNumbers)
    val listOfNumbers2: MutableList<Int> = mutableListOf()
    /*
    1) Использовать абстракции вместо реализаций (родительский тип)
    2) По умолчанию базовый интерфейс коллекций неизменяемые, чтобы сделать их изменяемые
     необходимо использовать интерфейсы с приставкой Mutable
    3) К элементам коллекцкии можно обращаться, как к элементам массива через []
    4) Быстрая инициализация коллекций: listOf, setOf, mapOf, arrayOf.
     Если нужны изменяемые коллекции, то те же методы с приставкой mutable
    * */
}

//fun methodOfList(list: List<Int>) {
//    list.add(2)
//}