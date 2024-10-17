package com.example.kotlinplayground.functions

fun printName(name: String) : Unit {
    // Unit: 리턴값이 없는 함수
    // 타입을 명시하지 않아도 됨
    println("Name is : $name")
}

fun addtion(x: Int, y: Int) : Int {
    return x+y
}

fun addtion_approach1(x: Int, y: Int) = x+y

fun main() {
    val unit = printName("Dilip")
    println("Unit is $unit")

    val result = addtion(1, 2)
    println("Result is $result")

    val result1 = addtion_approach1(1, 2)
    println("Result1 is $result1")
}