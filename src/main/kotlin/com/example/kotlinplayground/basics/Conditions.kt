package com.example.kotlinplayground.basics

fun main() {
    // if-else
    //when

    val name = "Alex"
//    val name = "danbi"
//    val result = if (name.length == 4) {
//        println("Name is Four Characters")
//        name
//    } else {
//        println("Name is not Four Characters")
//        name
//    }
//
//    println("result : $result")
//
//    var position = 1
//    position = 2
////    val medal = if (position == 1) {
////        "GOLD"
////    } else if (position == 2) {
////        "SILVER"
////    } else if (position == 3) {
////        "BRONZE"
////    } else {
////        "NO MEDAL"
////    }
//
//    val medal = when (position) {
//        1 -> "GOLD"
//        2 -> "SILVER"
//        3 -> "BRONZE"
//        else -> "NO MEDAL"
//    }
//    println(medal)

    exploreWhile()
    exploreDoWhile()
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("Value of x is: $x")
        x++
    }
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of x is: $i")
        i++
    } while (i < 5)
}