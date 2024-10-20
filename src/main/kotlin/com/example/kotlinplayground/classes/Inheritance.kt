package com.example.kotlinplayground.classes

open class User(val name : String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        println("Inside user Login")
    }

    private fun secret() {
        println("Inside user Login")
    }
    open protected fun logout() {
        println("Inside user Login")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn : Boolean = false

    companion object { // java의 static 기능
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }

    override fun login() {
        println("Inside student Login")
        super.login()
    }

    public override fun logout() {
        println("Inside user Logout")
        super.logout()
    }
}
class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is : ${student.isLoggedIn}")
    student.logout()

    val country = Student.country()
    println("Country is $country")
    println("noOfEnrolledCourses is ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Amy")
    println("name is ${instructor.name}")
    instructor.login()

    val user = User("A")

}