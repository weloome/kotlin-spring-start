package com.example.kotlinplayground.scopefunctions

import com.example.kotlinplayground.classes.Course
import com.example.kotlinplayground.classes.CourseCategory


fun main() {
//    exploreApply()
//    exploreAlso()
//    exploreLet()
//    exploreWith()
    exploreRun()
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    var result = numbers.run {
        numbers = mutableListOf(1, 2, 3)
        numbers?.sum()
    }
    println("Run Result is : $result")

    val length = run {
        val name = "chibi"
        println(name)
        name.length
    }
    println("Run length is : $length")
}

fun exploreWith() {
    val numbers = mutableListOf(1,2,3,4,5)

    val result = with(numbers) {
        println("Size is ${numbers.size}")
//        numbers.plus(6)
//        numbers.sum()
        val list = numbers.plus(6)
        println("Size is $size")
        sum()
    }
    println("With Result is : $result")
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