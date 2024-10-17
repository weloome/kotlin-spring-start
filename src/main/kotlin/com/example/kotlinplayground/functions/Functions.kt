package com.example.kotlinplayground.functions

import org.springframework.cglib.core.Local
import java.time.LocalDate

fun printName(name: String) : Unit {
    // Unit: 리턴값이 없는 함수
    // 타입을 명시하지 않아도 됨
    println("Name is : $name")
}

fun addtion(x: Int, y: Int) : Int {
    return x+y
}

fun addtion_approach1(x: Int, y: Int) = x+y

fun printPersonDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("Name is $name and the email is $email and the dob is $dob")
}

fun main() {
//    val unit = printName("Dilip")
//    println("Unit is $unit")
//
//    val result = addtion(1, 2)
//    println("Result is $result")
//
//    val result1 = addtion_approach1(1, 2)
//    println("Result1 is $result1")

    printPersonDetails("Danbi", "abc@gmail.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("Danbi2")
    printPersonDetails(dob=LocalDate.parse("2024-09-28"), email = "test@naver.com", name="Danbi3")
}