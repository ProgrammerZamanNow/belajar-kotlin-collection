package app

fun main() {
    val list1 = listOf("Eko", "Kurniawan", "Khannedy")
    val list2 = list1 + "Programmer"
    println(list2)
    val list3 = list1 + listOf("Programmer", "Zaman", "Now")
    println(list3)
    val list4 = list1 - "Eko"
    println(list4)
    val list5 = list1 - listOf("Eko", "Khannedy", "Budi")
    println(list5)

    val map1 = mapOf("a" to "Eko", "b" to "Kurniawan")
    val map2 = map1 + ("c" to "Khannedy")
    println(map2)
    val map3 = map1 - "a"
    println(map3)
}