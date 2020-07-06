package app

fun main() {
    val map = mapOf(
            "a" to "Eko",
            "b" to "Kurniawan",
            "c" to "Khannedy"
    )

    for((key, value) in map){
        println("$key : $value")
    }

    // map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}") }
    map.forEach { (key, value) -> println("$key : $value") }
}