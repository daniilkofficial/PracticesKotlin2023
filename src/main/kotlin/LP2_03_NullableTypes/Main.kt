package LP2_03_NullableTypes

//private var name: String? = null
private var name: String? = "fdsf"

fun main() {
    // Все объекты не могут хранить null, если не стоит тип Nullable?
    // Небезопастный вызов (преобразование в обычный тип)
    // println(name!!.length) // будет выдано NullPointerException
    // Безопастный вызов
    val length = name?.length // Int?
    val lengthStr = name?.length.toString() // String
    // Значение поумолчанию вместо null, элвис оператор
    val lengthIfNull = name?.length ?: 0 // Условие если будет null то получим 0
    println(lengthIfNull)
    // Домашнее задание
    // Есть три null'ные строки вам нужно сохранить в переменную result
    // сумму длин всех строк и вывести на экран.
    // Если строка null то использовать 0
    val a: String? = null
    val b: String? = "2"
    val c: String? = null

    val result: Int = (a?.length ?: 0) + (b?.length ?: 0) + (c?.length ?: 0)
    println("Результат: " + result)
}