package com.example.kotlinplayground;

import com.example.kotlinplayground.classes.Course;
import com.example.kotlinplayground.classes.CourseCategory;

public class invokeKotlinFromJava {

    public static void main(String[] args) {

        var course = new Course(1,
                "Reactive Programming in Modern Java using Project Reactor",
                "D",
                CourseCategory.DEVELOPMENT);

        System.out.println("course: " + course);
    }
}
