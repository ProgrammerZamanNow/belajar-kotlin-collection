package app

fun main() {
//    for (value in listOf("Eko", "Kurniawan", "Khannedy")) {
//        println(value)
//    }

    setOf("Eko", "Kurniawan", "Khannedy").forEach {
        println(it)
    }

    mutableSetOf("Eko", "Kurniawan", "Khannedy").forEachIndexed { index, value ->
        println("$index : $value")
    }
}