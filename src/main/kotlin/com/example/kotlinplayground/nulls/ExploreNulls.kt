package com.example.kotlinplayground.nulls
data class Movie(
    val id : Int?,
    val name : String)

fun printName(name: String) {
    println("Name is : $name")
}

fun main() {
    var nameNullable : String? = null

//    printName(nameNullable!!)
    nameNullable?.run {
        printName(this)
    }
    println("Value is : ${nameNullable?.length}") // safe operator , ?
    nameNullable = "Danbi"
    val length = nameNullable?.length?.toLong() ?: 0
    println("length : $length")


//    if (nameNullable != null) {
//        println("Value is : ${nameNullable.length}")
//    }

    nameNullable = "Danbi"
    println("Value is : $nameNullable")

    var name : String = "Danbi"

    val movie = Movie(null, "Cats")
    val saveMovie = saveMovie(movie)
    println(saveMovie.id!!)
    println("Saved Movie : $saveMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
//    return movie
}