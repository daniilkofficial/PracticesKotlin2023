package LP2_11_DefaultAndNamedParameters

fun main() {
    printInfo("Иванов")
    // значение по умолчанию и именованные параметры
    printInfo(name = "Иван")

    // Домашнее задание
    // Создать метод, который возращает объем параллелепипеда.
    // В качестве параметра можно передать от 1 до 3 сторон.

    // Если передана 1 сторона, то считается, что все стороны равны.
    // Если передана 2 сторона, то считается, что 1-ая и 3-я стороны равны.
    // Метод должен быть 1 (без перегрузок)
    // Метод должен быть записан в одну строчку, без слова return
    println(volume(10))
    println(volume(10, 20))
    println(volume(10, 20, 30))
}

fun volume(a: Int, b: Int = a, h: Int = a) = a * b * h


fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {
    if (lastName.isNotEmpty())
        println("Фамилия: $lastName")
    if (name.isNotEmpty())
        println("Имя: $name")
    if (patronymic.isNotEmpty())
        println("Отчество: $patronymic")
}

//fun printInfo(lastName: String, name: String) {
//    printInfo(lastName, name, "")
//}