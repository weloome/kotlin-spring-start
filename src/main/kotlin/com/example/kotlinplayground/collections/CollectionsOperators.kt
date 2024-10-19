package com.example.kotlinplayground.collections

import com.example.kotlinplayground.dataset.Course
import com.example.kotlinplayground.dataset.CourseCategory
import com.example.kotlinplayground.dataset.KAFKA
import com.example.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = {c: Course -> c.category == CourseCategory.DEVELOPEMENT}
    val desPredicate = {c: Course -> c.category == CourseCategory.DESIGN}
//    exploreFilter(courseList, desPredicate)

//    exploreMap(courseList, desPredicate)

    val list = listOf(listOf(1,2,3), listOf(4,5,6))
    val mapResult = list.map { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
//    println("mapResult : $mapResult")
    val flatMapResult = list.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
//    println("flatMapResult : $flatMapResult")
    val courses = exploreFlatMap(courseList, KAFKA)
//    println("courses : $courses")

    exploreHashMap()
}

fun exploreHashMap() {
    // 변경가능한 key-value 맵 컬렉션
    val nameAgeMutableMap = mutableMapOf("Danbi" to 33, "chibi" to 10)
    nameAgeMutableMap
        .forEach{ (k,v) ->
            println("Key : $k and the value is $v")
        }
    val value = nameAgeMutableMap.get("Danbi")
    println("Value is $value")
    val value2 = nameAgeMutableMap["chibi"]
    println("Value is $value2")
    val value3 = nameAgeMutableMap.getOrElse("somee"){"abc"}
    println("Value is $value3")
    val result = nameAgeMutableMap.containsKey("abc")
    println("result is $result")
    val filterMap = nameAgeMutableMap.filterKeys {it.length > 5}
        .map { it.key.uppercase() }
    println("filterMap is $filterMap")
    val maxAge = nameAgeMutableMap
        .maxByOrNull { it.value }
    println("maxAge is $maxAge")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String) : List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map { courseName }
    }
    return kafkaCourses
}

fun exploreMap(courseList: MutableList<Course>,
               predicate: (Course) -> Boolean) {

    val courses = courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}"}
        .forEach{ // forEach는 반환값이 저장되고 Unit을 반환함
            println(it)
        }
    println("courses: $courses")
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