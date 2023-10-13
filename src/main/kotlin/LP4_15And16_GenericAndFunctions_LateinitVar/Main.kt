package LP4_15And16_GenericAndFunctions_LateinitVar

fun main() {
//    val arrayList = arrayListOf(5, 6, 3, 7)

//    val list: MyList<Int> = MyArrayList()
    val list = MyArrayList.myListOf<String>()
    for (i in 0..100) {
        list.add("$i")
    }
    for (i in 0..90) {
        list.removeAt(0)
    }
    for (i in 0 until list.size()) {
        println(list.get(i))
    }

    // Lateinit var
    var dog = Dog()
    dog.printA()
}