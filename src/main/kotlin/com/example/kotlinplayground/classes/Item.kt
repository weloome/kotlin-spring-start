package com.example.kotlinplayground.classes

class Item() { // 빈 생성자
    var name : String = "" // name 속성 초기화
    var price : Double = 0.0

    get() {
        println("Inside Getter")
        // field: 프로퍼티의 실제 저장 공간
        return field // price의 실제 값을 반환
    }
    set(value) {
        println("Inside Setter")
        if (value >= 0.0) {
            field = value
        } else {
            throw IllegalArgumentException("Negative Price is not Allowed!")
        }
    }

    // constructor 키워드를 사용하여 보조 생성자 추가
    constructor(_name: String) : this() { // this()는 기본 생성자를 호출. 보조 생성자 실행 전 기본 생성자를 먼저 호출해야함
        // 언더바를 사용하여 클래스 속성과 매개변수를 구분
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 13"
    println("Item name is ${item.name}")

    item.price = 10.0
    println(item.price)
}