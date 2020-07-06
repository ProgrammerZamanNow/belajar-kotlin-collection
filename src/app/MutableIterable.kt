package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
//    for (value in iterable) {
//        println(value)
//    }

    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        // iterator.remove() // menghapus data di iterasi saat ini
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Eko", "Kurniawan", "Khannedy"))
    displayMutableIterable(mutableListOf("Eko", "Kurniawan", "Khannedy"))
}