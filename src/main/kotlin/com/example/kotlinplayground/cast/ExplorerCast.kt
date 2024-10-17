package com.example.kotlinplayground.cast

import com.example.kotlinplayground.classes.Course

fun checkType(type: Any) {
    when (type) {
        is Course -> { // 스마트캐스팅: 조건 맞춰 자동으로 전환 (val course = type as Course => 필요없음)
            println(type.copy())
        }
        is String -> {
            println(type.lowercase())
        }
    }
}

fun castNumber(any: Any) {
    when (any) {
        any as Double -> println("Value is Double")

    }
}

fun main() {
    val course = Course(1, "Reactive Programming in Modern Java using Project Reactor", "D")
    checkType(course)
    checkType("JEJE")

    castNumber(1.0)
//    castNumber(1)
    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)
}