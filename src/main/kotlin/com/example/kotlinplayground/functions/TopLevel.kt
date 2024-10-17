package com.example.kotlinplayground.functions

const val courseName = "Kotlin Programing" // 최상위 레벨 상수

fun topLevelFunction() : Int {
    return (1..100).random()
}

fun main() {

    val num = topLevelFunction()
    println("Num is : $num")
}