package app

fun main() {
    val numbers = (0..100).toList()

    val list1 = numbers.slice(0..50)
    println(list1)

    val list2 = numbers.slice(0..100 step 2)
    println(list2)

    val list3 = numbers.slice(100 downTo 0 step 2)
    println(list3)
}