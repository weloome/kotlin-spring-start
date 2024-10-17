package com.example.kotlinplayground.classes

object Authenticate {

    fun authenticate(userName: String, password: String) {
        println("User authenticate for username: $userName")
    }
}

fun main() {
    // 객체 클래스 내부 함수 호출
    Authenticate.authenticate("danbi", "study")
}