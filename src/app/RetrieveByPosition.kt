package app

fun main() {
    val set = setOf("Eko", "Kurniawan", "Khannedy")

    println(set.elementAt(0))
    println(set.first())
    println(set.last())
    println(set.elementAtOrNull(2))
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(2) { "Tidak Ada" })
    println(set.elementAtOrElse(10) { "Tidak Ada" })
}