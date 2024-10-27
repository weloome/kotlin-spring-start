package com.example.kotlinplayground;

import com.example.kotlinplayground.classes.Authenticate;
import com.example.kotlinplayground.classes.Course;
import com.example.kotlinplayground.classes.CourseCategory;
import com.example.kotlinplayground.classes.CourseUtils;

public class invokeKotlinFromJava {

    public static void main(String[] args) {

        var course = new Course(1,
                "Reactive Programming in Modern Java using Project Reactor",
                "D"
                //CourseCategory.DEVELOPMENT // @JvmOverloads를 사용한 생성자를 통한 기본값 처리
                );

        course.noOfCourses = 11;

        System.out.println("course: " + course);
        System.out.println("noOfCourses: " + course.noOfCourses);

        CourseUtils.printName1();
        CourseUtils.printName1("abc");
        Course.Companion.printName2("def");
        Course.printName2("ghi");

        Authenticate.INSTANCE.authenticate("jeje", "cat");
        Authenticate.authenticate("jk", "lee");
    }

}
