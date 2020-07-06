package app

fun main() {
    val map: Map<Int, String> = mapOf(
            1 to "Eko",
            2 to "Kurniawna",
            3 to "Khannedy"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)
}