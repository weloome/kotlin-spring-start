package com.example.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {

    val course = Course(1, "Reactive Programming in Modern Java using Project Reactor", "D")
    println(course)

    val course1 = Course(2, "Reactive Programming in Modern Java using Project Reactor", "D")

    // 동등 객체 비교
    println("Checking Object Equality : ${course == course1}")

    // 객체 복사
    val course3 = course1.copy(
        id=3, author = "D"
    )
    println(course3)

    val marketingCourse = Course(2, "Facebook Marketing", "AOP", CourseCategory.MARKETING)
    println(marketingCourse)
}