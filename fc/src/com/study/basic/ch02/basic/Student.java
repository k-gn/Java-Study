package com.study.basic.ch02.basic;

// # 객체
// 의사나 행위가 미치는 대상 ( 사전적 의미 )
// 구체적, 추상적 데이터의 단위 ( 학생, 회원, 생산, 주문, 배송 )
// 즉, 존재하는 명사들

// 객체를 정의 하고 각 객체 제공하는 기능들을 구현하고
// 각 객체가 제공하는 기능들 간의 소통(메세지 전달)을 통하여 객체간의 협력을 구현
// 객체를 정의 ->  객체의 속성을 멤버 변수로 역할을 메서드로 구현 -> 객체간의 협력을 구현

// 클래스 : 객체를 만드는 틀, 객체의 청사진
public class Student { // 클래스는 대문자로 시작
    // java 파일 하나에 클래스는 여러 개가 있을 수 있지만, public 클래스는 하나이고, public 클래스와 .java 파일의 이름은 동일함

    // 객체의 속성 - 멤버변수 (필드, 전역)
    // 멤버변수는 선언과 동시에 기본값으로 초기화된다.
    public int studentID;
    public String studentName;
    public String address;

    // # 생성자
    // 객체가 객체화 될 때 호출되는 특수 함수
    // 생성자 기본 문법
    // 접근제한자 <class_name>([<argument_list]) {
    //      [<statements]
    // }
    // 객체를 생성할 때 new 키워드와 함께 사용   - new Student();
    // 생성자는 일반 함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new 와 함께 호출 됨
    // void나 int처럼 반환형이 없고 리턴값도 없으며, 입력만 있고 출력은 없는 함수. 초기화 작업만 한다.
    // 객체가 생성될 때 변수나 상수를 초기화 하거나 다른 초기화 기능을 수행하는 메서드를 호출 함
    // 생성자는 반환 값이 없고, 클래스의 이름과 동일
    // 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private 으로 선언되는 경우도 있음

    // 클래스에는 반드시 적어도 하나 이상의 생성자가 존재
    // 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있음
    // 클래스에 생성자가 하나도 없는 경우 컴파일러가 기본 생성자 코드를 넣어 줌
    // 단, 생성자가 하나라도 있으면 기본생성자를 만들어주지 않음 -> 기본 생성자가 필요하면 직접 만들어줘야함
    public Student() { // 기본 생성자 (default constructor)

    }

    // 오버로딩 : 같은 메소드명으로, 매개변수만 다르게 중복 선언 가능
    // 오버로딩은 사용의 편의성을 높여준다. (같은 메소드명으로 필요에 따라 다른 매개변수를 받아 사용, 같은 기능인데 메소드명이 다르면 여러가지로 불편할 수 있다.)
    // 생성자 오버로딩 가능
    // 컴파일러가 제공해 주는 기본 생성자외에 필요에 의해 생성자를 직접 구현 할 수 있음
    public Student(int studentID, String studentName, String address) {
        // this : 자기 자신 참조
        // this() : 자신의 생성자
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
    }

    // # 함수
    // 하나의 기능을 수행하는 일련의 코드
    // 구현된 함수는 호출하여 사용하고, 호출된 함수는 기능이 끝나면 제어가 반환됨
    // 함수로 구현된 하나의 기능은 여러곳에서 동일한 방식으로 호출되어 사용됨
    // 함수는 이름, 매개 변수, 반환 값, 함수 몸체(body)로 구성됨

    int add(int num1, int num2) {

        int result;
        result = num1 + num2;
        return result;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}

