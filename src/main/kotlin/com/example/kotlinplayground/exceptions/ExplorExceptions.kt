package com.example.kotlinplayground.exceptions

fun main() {
    println("Name Length is ${nameLength("Danbi")}")
    println("Name Length is ${nameLength(null)}")
    returnNothing()
}

fun returnNothing() : Nothing {
    throw RuntimeException("Exception")
}

fun nameLength(name: String?) : Int? {
    val result = try {
        name!!.length
    } catch (ex: Exception) {
        println("Exception is : $ex")
        null
    }

    return result
}