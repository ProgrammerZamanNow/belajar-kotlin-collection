package app

fun main() {
    val array = arrayOf(3, 5, 1, 4, 67, 8, 3)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet = range.toMutableSet()
    val mutableList = range.toMutableList()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()

    val sortedSet = array.toSortedSet()
}