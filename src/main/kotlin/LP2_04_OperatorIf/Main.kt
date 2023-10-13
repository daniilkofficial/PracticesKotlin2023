package LP2_04_OperatorIf

fun main() {
    val a = 50
    if (a < 40) {
        println("Меньше 40")
    } else if (a < 60) {
        println("Больше 40, но меньше 60")
    } else {
        println("Больше  либо равно 60")
    }
    // Задача
    // У вас есть n-рублей в зависимости от их кол-ва
    // вы можете приобрести различные продукты
    // Преимущество Kotlin: можно сделать в виде выражения
    var count = 600
    val food: String = if (count > 500) {
        count -= 500
        println("Do something")
        "Пицца"
    } else if (count > 300) {
        count -= 300
        "Шаурма"
    } else {
        count -= 30
        "Доширак"
    } // без else будет возникать ошибка, обязательно кога вид выражение (присвоение)
    // При возращении null станет Nullable тип, при различающихся типов будет тип Any (подобие Object)
    // При отсутвии возвращаемого значение будет тип Unit (подобие Void)
    //    println("Вы можете позволить себе купить следующий продукт: " + food)
    // формат. в Kotlin
    println("Вы можете позволить себе купить следующий продукт: ${food.lowercase()}, у вас осталось: $count рублей")
}