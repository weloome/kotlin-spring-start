package com.example.kotlinplayground.interfaces

import com.example.kotlinplayground.classes.Course

interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int) : Course

    fun save(course: Course) : Int {
        println("course: $course")
        return course.id
    }

}

interface Repository {
    fun getAll() : Any
}


class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int) : Course {
        return Course(
            id,
            "Reactive Programming in Modern Java using Project Reactor",
            "D")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false // 초기값

    override fun getById(id: Int) : Course {
        return Course(
            id,
            "Reactive Programming in Modern Java using Project Reactor",
            "D")
    }

    override fun save(course: Course): Int {
        println("course in NoSqlCourseRepository: $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is $course")
    val courseId = sqlCourseRepository.save(Course(
        7,
        "Reactive Programming in Modern Java using Project Reactor",
        "D"))

    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")
    println("Saved Course Id is $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(1)
    println("Course is $course")
    val saveCourseId = noSqlCourseRepository.save(Course(
        10,
        "Reactive Programming in Modern Java using Project Reactor",
        "D"))
    println("Saved Course Id in noSqlCourseRepository : $saveCourseId")

    val ab = AB()
    ab.doSomething()

}