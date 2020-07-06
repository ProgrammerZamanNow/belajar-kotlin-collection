package app

fun main() {
    val list = mutableListOf("Eko", "Kurniawan", "Khannedy")

    val listReversed = list.reversed()
    val listAsReversed = list.asReversed()

    println(listReversed)
    println(listAsReversed)

    list.add("Programmer")

    println(listReversed)
    println(listAsReversed)
}