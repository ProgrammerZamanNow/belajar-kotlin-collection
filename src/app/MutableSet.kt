package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Eko"))
    mutableSet.add(Person("Kurniawan"))
    mutableSet.add(Person("Khannedy"))
    mutableSet.add(Person("Eko"))
    mutableSet.add(Person("Khannedy"))

    for (person in mutableSet) {
        println(person)
    }

    val mutableSetString = mutableSetOf("Eko", "Kurniawan", "Khannedy")
}