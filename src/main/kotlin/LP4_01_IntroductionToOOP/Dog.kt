package LP4_01_IntroductionToOOP

import java.util.*

class Dog {
    var nickname = ""
        get() = field.lowercase()
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    var age = 0
        set(value) {
            if (value >= 0)
                field = value
        }

    var weight = 0F
        set(value) {
            if (value >= 0)
                field = value
        }
}
