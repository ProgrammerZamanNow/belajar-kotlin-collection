package app

import java.lang.StringBuilder

fun main() {
    val list: List<String> = listOf("Eko", "Kurniawan", "Khannedy")

    val string1: String = list.joinToString(" ", "|", "|")
    println(string1)

    val string2: String = list.joinToString(" ", "|", "|") { it.toUpperCase() }
    println(string2)

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, " ", ">", "<")
    list.joinTo(builder, " ", "@", "@")
    val string3 = builder.toString()
    println(string3)

    val numbers: List<Int> = (1..10).toList()
    println(numbers.joinToString())
}