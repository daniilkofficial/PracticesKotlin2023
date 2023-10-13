package LP4_02_Constructors

// Первичный внутри скобок класса при var изменяемые с val final не изменяемые (без set)
// Можно к свойствам задавать значения поумолчанию
class Country(val name: String = "", val population: Long = 0) {
    // Вторичный конструктор обязан вызвать первичный
    //    constructor() : this("", 0) {
    //    }

}