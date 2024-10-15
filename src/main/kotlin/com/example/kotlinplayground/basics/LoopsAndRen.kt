package com.example.kotlinplayground.basics

fun main() {

    // 범위
    val range = 1..10
    for (i in range) {
        println("i : $i")
    }

    // 역순
    val reverseRange  = 10 downTo 1
    for (i in reverseRange) {
        println("reverseRange: $i")
    }

    // 값 건너뛰기
    for (i in reverseRange step 2) {
        println("reverseRange with Skip: $i")
    }


}