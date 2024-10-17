package com.example.kotlinplayground.basics

fun main() {
    // 중단문
    for (i in 1..5) {
        println("i in $i")
        // 반복문을 중단하고 나옴
        if (i==3) break
    }

    label()

    println("End of the Program!")
}

fun label() {
    // 반복문에 이름 붙여주기
    loop@ for (i in 1..5) {
        println("i in label $i")
//        if (i==3) break@loop
        innerloop@ for (j in 1..5) {
            println("j in label $j")
            if (j==2) continue@loop
        }
    }

    listOf(1,2,3,4,5).forEach each@{
        if (it == 3) return@each
    }
}