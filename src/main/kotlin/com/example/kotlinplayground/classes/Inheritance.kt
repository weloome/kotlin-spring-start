package com.example.kotlinplayground.classes

open class User(val name : String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        println("Inside user Login")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn : Boolean = false
    override fun login() {
        println("Inside student Login")
        super.login()
    }
}
class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is : ${student.isLoggedIn}")

    val instructor = Instructor("Amy")
    println("name is ${instructor.name}")
    instructor.login()
}