package app

fun main() {
    val numbers = (1..20).toList()

    println(numbers.first { it > 10 })
    println(numbers.last { it > 10 })
    println(numbers.firstOrNull { it > 50 })
    println(numbers.find { it > 50 })
    println(numbers.lastOrNull { it > 50 })
    println(numbers.findLast { it > 50 })
}