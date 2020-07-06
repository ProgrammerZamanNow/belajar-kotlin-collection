package app

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    println("Display Previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

fun main() {
    displayListIterator(listOf("Eko", "Kurniawan", "Khannedy").listIterator())
}