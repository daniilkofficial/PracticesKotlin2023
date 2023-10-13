package LP3_08_CreatingFunctionsHigherOrder

import java.util.*


fun main() {
    val result = modifyString("Hello world!") { it.uppercase(Locale.getDefault()) }
    println(result)

    // Задача
    val list = (0..100).toList()
    listModify(list) { // без создание функции анонимного класа - inline улучшение производительности
        println(it.sum())
    }
    // при небольшой функции лучше объявить inline
//    println(list.sum())
    //
}


fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

inline fun listModify(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}
