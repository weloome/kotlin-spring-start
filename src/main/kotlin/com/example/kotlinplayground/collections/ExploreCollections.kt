package com.example.kotlinplayground.collections

fun main() {
    // 불변 컬렉션
    val names = listOf("jeje", "chibi", "som")
    println("Names : $names")
    val namesMutableList = mutableListOf("jeje", "chibi", "som")
    namesMutableList.add("danbi")
    println("namesMutableList after : $namesMutableList")

    val set = setOf("jeje", "chibi", "som")
    println("set : $set")
    val mutableSet = mutableSetOf("jeje", "chibi", "som")
    mutableSet.add("danbi")
    println("mutableSet : $mutableSet")

    val nameAgeMap = mapOf("chibi" to 10, "som" to 6)
    println("nameAgeMap : $nameAgeMap")
    val nameAgeMutableMap = mutableMapOf("chibi" to 10, "som" to 6)
    println("nameAgeMutableMap : $nameAgeMutableMap")
    nameAgeMutableMap.put("jeje", 6)
    nameAgeMutableMap["danbi"] = 33
    println("nameAgeMutableMap after : $nameAgeMutableMap")


}