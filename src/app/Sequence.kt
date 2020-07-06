package app

fun main() {
    val words = "the quick brown fox jumps over the lazy dog".split(" ")

    val result = words
            .filter {
                println("filter $it")
                it.length > 3
            }
            .map {
                println("map $it")
                it.toUpperCase()
            }
            .take(4)

    println(result)

    println("===============")

    val sequence = words.asSequence()

    val resultSequence = sequence
            .filter {
                println("filter $it")
                it.length > 3
            }
            .map {
                println("map $it")
                it.toUpperCase()
            }
            .take(4)

    println(resultSequence.toList())

}