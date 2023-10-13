package LP4_01_IntroductionToOOP

fun main() {
    val user = User()
    user.name = null
    user.age = -22
    println("Имя: ${user.name} Возраст: ${user.age}")

    val user2 = User()
    user2.name = ""
    user2.age = 10
    user2.age = 18
    user2.age = -9
    println(user2.age)
    // ДЗ
    val dog = Dog()
    dog.nickname = "просто"
    println(" ${dog.nickname}")
}