package com.example.kotlinplayground.scopefunctions

import com.example.kotlinplayground.classes.Course
import com.example.kotlinplayground.classes.CourseCategory


fun main() {
    exploreApply()
    exploreAlso()
    exploreLet()
}

fun exploreLet() {
    val numbers = mutableListOf(1,2,3,4,5)
    val result = numbers.map { it*2 }.filter { it>5 }.let {
        println(it)
        it.sum()
    }
    println(result)

    var name : String? = null
    val result1 = name?.let {
        println(it)
        it.uppercase()
    }
    println(result1)
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