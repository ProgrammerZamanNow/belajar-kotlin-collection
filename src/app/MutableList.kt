package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Eko")
    mutableList.add("Kurniawan")
    mutableList.add("Khannedy")

    // mutableList[0] = "Budi"
    // mutableList.remove("Eko")

    for (value in mutableList) {
        println(value)
    }
}