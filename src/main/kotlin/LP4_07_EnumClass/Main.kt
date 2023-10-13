package LP4_07_EnumClass

import LP4_07_EnumClass.Month.*
import LP4_07_EnumClass.Season.*

fun main() {
    val month: Month = NOVEMBER
    val season = when (month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }
    println(month.tempAverage)
    println(season)
}