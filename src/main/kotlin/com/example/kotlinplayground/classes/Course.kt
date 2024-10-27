@file:JvmName("CourseUtils") // 파일명 변경

package com.example.kotlinplayground.classes

import com.example.kotlinplayground.CourseJava

data class Course @JvmOverloads constructor (
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
) {

    @JvmField // 필드추가
    var noOfCourses = 10

    companion object {

        @JvmStatic // companion을 안붙여도되게해줌 :: 정적함수
        fun printName2(name: String = "default") {
            println("name: $name")
        }
    }
}

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

@JvmName("printName1") // 메서드명 변경
@JvmOverloads
fun printName(name: String = "default") {
    println("name: $name")
}

fun main() {

    val course = Course(1, "Reactive Programming in Modern Java using Project Reactor", "D")
    println(course)

    val course1 = Course(2, "Reactive Programming in Modern Java using Project Reactor", "D")

    // 동등 객체 비교
    println("Checking Object Equality : ${course == course1}")

    // 객체 복사
    val course3 = course1.copy(
        id=3, author = "D"
    )
    println(course3)

    val marketingCourse = Course(2, "Facebook Marketing", "AOP", CourseCategory.MARKETING)
    println(marketingCourse)

    val courseJava = CourseJava(2, "Facebook Marketing", "AOP")
    println("courseJava: $courseJava")
    courseJava.id = 3;
    courseJava.name="jeje"
    println("courseJava: $courseJava")
}