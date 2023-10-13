package LP2_06_OperatorWhen

fun main() {
    val nameOfMonth = "Сентябрь"
    // без break, можно использовать в виде выражения
    val season = when (nameOfMonth) {
        "Декабрь", "Январь", "Февраль" -> {
            "Зима"
        }

        "Март", "Апрель", "Май" -> {
            "Весна"
        }

        "Июнь", "Июль", "Август" -> {
            "Лето"
        }

        "Сентябрь", "Октябрь", "Ноябрь" -> {
            "Осень"
        }

        else -> {
            "Не найдено"
        }
    }
    println(season)


    val indexOfMount = 3
    val seasonOfNum = when (indexOfMount) {
        12, 1, 2 -> {
            "Зима"
        }

        in 3..5 -> {
            "Весна"
        }

        in 6..8 -> {
            "Лето"
        }

        9, 10, 11 -> {
            "Осень"
        }

        else -> {
            "Не найдено"

        }
    }
    println(seasonOfNum)


    println("\nЗадача про воду")
    // Преимущество when
    // Задача про воду. Самим написать с помощью if.
    // Полученную температуру воды и вывод состояние воды: твердое, жидкое или газо-образное.
    val temp = 80
//   val state = onIf(temp)
    val state = when {
        temp < 0 -> "Твердое"
        temp < 100 -> "Жидкое"
        else -> "Газообразное"
    }
    println(state)

    println("\nДомашнее задание")

    // Домашнее задание
    // Дано текущее время n часов и состояние погоды (хорошая или плохая)
    // В зависимости от времени и погоды вывести строку:
    // Если сейчас день и погода хорошая - гулять
    // Если сейчас день и погода плохая - читать книгу
    // Если сейчас ночь (независимо от погоды) - спать
    val time = 20
//    val weather = "плохая"
//    val isDay = time > 6 && time < 22
    val weatherIsGood = false

    val toDo = when {
        time in 6..22 && weatherIsGood -> "Гулять"
        time in 6..22 && !weatherIsGood -> "Читать книгу"
        else -> "Спать"
    }
    println(toDo)
}


private fun onIf(temp: Int): String = if (temp < 0) {
    "Твердое"
} else if (temp < 100) {
    "Жидкое"
} else {
    "Газообразное"
}