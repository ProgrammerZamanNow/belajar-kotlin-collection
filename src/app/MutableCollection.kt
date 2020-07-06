package app

fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
    // displayMutableCollection(listOf("Eko", "Kurniawan")) // ERROR
    displayMutableCollection(mutableListOf("Eko", "Kurniawan"))
    // displayMutableCollection(setOf("Eko", "Kurniawan")) // ERROR
    displayMutableCollection(mutableSetOf("Eko", "Kurniawan"))
    // displayMutableCollection(mapOf("Eko" to "Kurniawan").entries) // ERROR
    displayMutableCollection(mutableMapOf("Eko" to "Kurniawan").entries)
}