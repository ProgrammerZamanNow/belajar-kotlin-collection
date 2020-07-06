package app

fun main() {
    val map = mapOf("a" to "Eko", "b" to "Kurniawna", "c" to "Khannedy")

    // println(map.getValue("tidak ada")) // exception
    println(map.getValue("a"))
    println(map.getOrElse("tidak ada") { "Ups" })
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })
}