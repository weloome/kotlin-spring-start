package com.example.kotlinplayground.nulls
data class Movie(
    val id : Int?,
    val name : String) {

}

fun main() {
    var nameNullable : String? = null
    println("Value is : $nameNullable")

    nameNullable = "Danbi"
    println("Value is : $nameNullable")

    var name : String = "Danbi"

    val movie = Movie(null, "Cats")
    val saveMovie = saveMovie(movie)
    println("Saved Movie : $saveMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}