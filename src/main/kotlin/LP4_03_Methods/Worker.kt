package LP4_03_Methods

import java.time.LocalDateTime

class Worker(val name: String, val post: String, val year: Int) {
    val experience: Int
        get() = LocalDateTime.now().year - year

    fun working() {
        println("Работаю...")
    }
}