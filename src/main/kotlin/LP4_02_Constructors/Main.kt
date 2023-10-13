package LP4_02_Constructors

fun main() {
//    val russia = Country("Russia", 144_000_000)
    val russia = Country(population = 100_000) // явное указание
    println(russia.name)
//    russia.population = 145_000_000
    println(russia.population)

    println()
    // ДЗ
    // Класс книга
    val book = Book("Круто")
    val book2 = Book("Крутой!", 1997, 100)
//    book.name = "Да не особо крутой!"
    println(book.name)

    book2.price = 290
    println("Имя ${book2.name} Цена ${book2.price}")
}