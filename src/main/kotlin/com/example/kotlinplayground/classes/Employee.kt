package com.example.kotlinplayground.classes

data class Employee(
    val id : Int,
    val name : String
) {
}

fun main() {
    // Employee 객체 생성
    val employee = Employee(1, "danbi")
    // 콘솔 출력
    println(employee)

    // 동일한 속성을 가진 Employee 객체 생성
    val anotherEmployee = employee.copy()
    // 객체 비교
    println(employee == anotherEmployee)

    val newEmployee = employee.copy(id = 3)
    println("newEmployee is $newEmployee")
}