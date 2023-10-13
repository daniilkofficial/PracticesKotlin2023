package LP3_09_ExtensionFunctions

import java.util.*

fun main() {
    val name = ""
    if (name.isNotEmpty()) {
        println("fsdf")
    }
    val age = 5
    println(age.isPositive())
    if (age.isAgeValid()) {
        println("Valid")
    }
    if (age.isAgeValid()) {
        println("Valid too")
    }
    if (age.isAgeValid()) {
        println("Valid too 2")
    }

    println()
    // Задача
    println(5.isPrime())
    println(29.isPrime())
    println(28.isPrime())
    println()

    // Дополнительная информация
    val list = listOf<Int>()
    val string = "fsddfs"
//    myWith(list) {
//        sum()
//        average()
//    }
//
//    myWith(string) {
//        println(uppercase(Locale.getDefault()))
//    }

    val obj = mutableMapOf<String, String>()
    myWith(obj) {
        keys
        values
    }

    with(obj){
        keys
        values
    }


}


fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0
fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

//fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
//    list.operation()
//}
//
//fun myWith(string: String, operation: String.() -> Unit) {
//    string.operation()
//}
//
//fun myWith(obj: Any, operation: Any.() -> Unit) {
//    obj.operation()
//}

//inline fun <T> myWith(obj: T, operation: T.() -> Unit) {
//    obj.operation()
//}

inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}