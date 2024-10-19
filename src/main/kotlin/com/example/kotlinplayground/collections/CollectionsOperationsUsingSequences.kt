package com.example.kotlinplayground.collections

import com.example.kotlinplayground.dataset.Course
import com.example.kotlinplayground.dataset.CourseCategory
import com.example.kotlinplayground.dataset.courseList

fun main() {
    val namesListUsingSequence = listOf("alex", "ben", "chloe")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()
    println("nameListUsingSequence : $namesListUsingSequence")

    val devPredicate = {c: Course -> c.category == CourseCategory.DEVELOPEMENT}
    exploreFilterUsingSequence(courseList(), devPredicate)

    // 시퀀스는 큰 데이터를 처리할때 주로 사용
    val range = 1..1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40) // 지정된 개수만큼 요소 가져오기
        .forEach {
            println("Value is : $it")
        }
}

fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean)
{
    courseList
        .asSequence()
        .filter{predicate.invoke(it)}
        .forEach {
            println("devCourses : $it")
        }

}