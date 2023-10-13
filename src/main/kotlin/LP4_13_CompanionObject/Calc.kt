package LP4_13_CompanionObject

class Calc {
    val a = 10 // свойсво

    companion object {
        const val PI = 3.14 // не создается get'ор, и в процессе в нем мог менятся
        fun square(num: Int) = num * num // обращение к полям вне object в классе нельзя
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}