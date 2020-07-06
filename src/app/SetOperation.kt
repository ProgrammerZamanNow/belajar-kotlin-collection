package app

fun main() {
    val numbers1 = (1..10).toSet()
    val numbers2 = (6..15).toSet()

    println(numbers1.union(numbers2))

    println(numbers1.intersect(numbers2))

    println(numbers1.subtract(numbers2))
    println(numbers2.subtract(numbers1))

}