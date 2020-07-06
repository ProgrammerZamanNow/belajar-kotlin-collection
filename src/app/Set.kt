package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
            Person("Eko"), Person("Kurniawan"), Person("Khannedy"), Person("Eko"), Person("Kurniawan")
    )

    println(set.size)
    println(set.contains(Person("Eko")))

    for (person in set){
        println(person)
    }
}