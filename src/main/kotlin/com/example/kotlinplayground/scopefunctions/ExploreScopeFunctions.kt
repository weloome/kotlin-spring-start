package com.example.kotlinplayground.scopefunctions

import com.example.kotlinplayground.classes.Course
import com.example.kotlinplayground.classes.CourseCategory


fun main() {
    exploreApply()
    exploreAlso()
}

fun exploreAlso() {
    val course = Course(1,
        "Design Thinking in Kotlin",
        "Danbi"
    ).also {
        println("course is $it")
    }
}

fun exploreApply() {
    val course = Course(1,
        "Design Thinking in Kotlin",
        "Danbi"
    ).apply {
//        courseCategory = CourseCategory.DESIGN
        this.courseCategory = CourseCategory.DESIGN
    }

    println("course: $course")
}