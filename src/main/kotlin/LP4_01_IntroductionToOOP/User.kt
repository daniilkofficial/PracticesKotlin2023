package LP4_01_IntroductionToOOP

class User {
    // Надо самим узначать значение по умолчанию, создание get'еров и set'еров не нужно,
    // т.к. создаются автоматически, свойство проперти имеет геттер и сеттер
    var age: Int = 0
        set(value) {
            if (value >= 0){
                field = value
            }
        }
    var name: String? = null
        get() {
            return if (field == null) {
                ""
            } else {
                field
            }
        }

}