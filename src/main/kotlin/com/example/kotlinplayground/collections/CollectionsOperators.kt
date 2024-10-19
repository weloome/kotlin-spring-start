package com.example.kotlinplayground.collections

import com.example.kotlinplayground.dataset.Course
import com.example.kotlinplayground.dataset.CourseCategory
import com.example.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = {c: Course -> c.category == CourseCategory.DEVELOPEMENT}
    val desPredicate = {c: Course -> c.category == CourseCategory.DESIGN}
    exploreFilter(courseList, desPredicate)
}

fun exploreFilter(courseList: MutableList<Course>,
                  predicate: (Course) -> Boolean) {

    // it은 특정 요소에 접근하는 키워드로 현재는 Course를 말한다
     courseList
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .filter{predicate.invoke(it)} // invoke: 함수 타입의 객체를 호출하는 메서드
        .forEach {
            println("devCourses : $it")
        }

}