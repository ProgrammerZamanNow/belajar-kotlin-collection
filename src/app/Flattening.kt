package app

class Member(val name: String, val hobies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
            listOf("Eko", "Kurniawan", "Khannedy"),
            listOf("Eko", "Kurniawan", "Khannedy"),
            listOf("Eko", "Kurniawan", "Khannedy"),
            listOf("Eko", "Kurniawan", "Khannedy")
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
            Member("Eko", listOf("Reading", "Coding")),
            Member("Budi", listOf("Gaming", "Traveling"))
    )

    // val hobies = members.map { it.hobies } .flatten()
    val hobies: List<String> = members.flatMap { it.hobies }
    println(hobies)
}