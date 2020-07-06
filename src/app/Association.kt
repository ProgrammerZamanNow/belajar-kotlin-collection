package app

fun main() {
    val list: List<String> = listOf("Eko", "Kurniawan", "Khannedy")

    val map: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(map)

    val map2: Map<String, Int> = list.associateWith { it.length }
    println(map2)

    val map3: Map<Int, String> = list.associateBy { it.length }
    println(map3)
}