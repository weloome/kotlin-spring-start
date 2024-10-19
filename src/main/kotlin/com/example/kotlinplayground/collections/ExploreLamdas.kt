package com.example.kotlinplayground.collections

// 고차원 함수 (함수안에 붙어있는 함수)
fun calculate(x:Int, y:Int, op:(x:Int, y:Int) -> Int) : Int {
    return op(x,y)
}

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

    val result = calculate(2, 3, {a,b -> a*b})
    val add = calculate(2, 3) {a,b -> a+b}
    println("Result is $result")
    println("Add is $add")
}