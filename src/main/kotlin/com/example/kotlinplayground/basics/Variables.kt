package com.example.kotlinplayground.basics

fun main() {
    // 상수
    val name = "D"
    println(name)
//    name = "Dilip1"

    // 변수
    var age = 33
    println(age)
    age = 34
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course : $course and the course length is ${course.length}")

    val multiline = "ABC \n DEF"
    println(multiline)

    val multiline1 = """
        ABC
        EDF
    """.trimIndent()
    println(multiline1)
}