package LP2_12_Exceptions

import java.lang.Exception

fun main() {
    sum("10", "aad")
}

fun sum(a: String, b: String): Int {
    val result = try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numA
    } catch (e: Exception) {
        0
    }
    println(result)
    return result
}