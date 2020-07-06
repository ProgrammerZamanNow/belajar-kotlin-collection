package app

fun main() {
    val numbers = listOf(1, 4, 3, 2, 5, 6, 8, 3, 4, 5)

    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()

    println(sortedAsc)
    println(sortedDesc)
}