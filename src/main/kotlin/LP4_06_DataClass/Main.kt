package LP4_06_DataClass

fun main() {
    val student1 = Student("Иван", "Иванов", "412344")
//    val student2 = Student("Иван", "Иванов", "412344")
    val student2 = student1.copy(id = "23444") // нужно data класс
//    val (name, lastName, id) = student1 // деструктор, получение из объекта данные.
    // Требуется data класс или переопределение оператор методов component1..n
//    println(name)
//    println(lastName)
//    println(id)


    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2) // проверка equals
    println(student1 === student2) // проверка ссылок (как обычное == в java)

    println()
    // ДЗ
    val address1 = Address("Ялта", "Гоголя", 4)
    val address2 = address1.copy()
    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 == address2)
    val (nameCity1, street1, numHome1) = address1
    val (nameCity2, street2, numHome2) = address2
    println(nameCity1)

}