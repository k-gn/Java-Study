package com.study.basic.ch04;

// java.lang 패키지
// 프로그래밍시 import 하지 않아도 자동으로 imort됨
// import.java.lang.*;
// 많이 사용하는 기본 클래스들이 속한 패키지
// String, Integer, System...

// 모든 클래스는 Object 클래스를 상속 받는다
// java.lang.Object 클래스
// 모든 클래스의 최상위 클래스 (모든 객체는 Object 타입으로 받을 수 있음)
// 모든 클래스는 Object에서 상속받고, Object 클래스의 메서드 중 일부는 재정의해서 사용할 수 있음
// 컴파일러가 extends Object를 추가함
// class Student => class Student extends Object
public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // # toString()
    // 객체의 정보를 String 으로 바꾸어서 사용할 때 쓰임 (객체 정보 표현에 많이 사용)
    // String 이나 Integer 클래스는 이미 재정의 되어 있음
    // toString()메서드 재정의 예
    @Override
    public String toString() {
        return title + "," + author;
    }


}
