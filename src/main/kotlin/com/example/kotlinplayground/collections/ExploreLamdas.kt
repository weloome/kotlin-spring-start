package com.example.kotlinplayground.collections

fun main() {
    val addLamda = { x: Int -> x+x }
    val addResult = addLamda(3)
    println("addResult: $addResult")

    val multiplyLamda = {x:Int,y:Int ->
        println("s is $x and y is $y")
        x * y // 출력 반환값은 마지막에 위치
    }
    val multiplyResult = multiplyLamda(2, 3)
    println("multiplyResult : $multiplyResult")
}