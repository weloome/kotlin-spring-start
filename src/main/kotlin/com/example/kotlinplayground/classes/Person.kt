package com.example.kotlinplayground.classes

class Person {

    fun action() {
        println("Person Walks")
    }
}

fun main() { // class를 실행할수 있게 해줌
    val person = Person()
    person.action()
}