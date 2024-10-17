package com.example.kotlinplayground.classes

class Person(
    //기본 생성자
    val name : String = "",
    val age : Int = 0
) {
    fun action() {
        println("Person Walks")
    }
}

fun main() { // class를 실행할수 있게 해줌
    val person = Person("Danbi", 33)
    person.action()
    println("Name : ${person.name} and the age is ${person.age}")

    val person1 = Person()
    println("Name : ${person1.name} and the age is ${person1.age}")
}