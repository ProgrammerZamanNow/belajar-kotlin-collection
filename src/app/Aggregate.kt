package app

fun main() {
    val numbers = (1..100).toList()

    println(numbers.max())
    println(numbers.min())
    println(numbers.average())
    println(numbers.sum())

    println(numbers.sumBy { it / 2 })
}