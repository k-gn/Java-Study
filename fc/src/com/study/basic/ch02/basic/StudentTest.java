package com.study.basic.ch02.basic;

public class StudentTest {
    public static void main(String[] args) {

        // 어떠한 존재하는 모든 명사적 개념 = 객체
        // 객체를 만들기 위한 틀 = 클래스
        // 클래스를 통해 생성된 객체 = 인스턴스 (클래스는 객체의 속성을 정의 하고, 기능을 구현하여 만들어 놓은 코드 상태)
        // 실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버 변수 값을 가지게 됨
        //      - 가령, 학생의 클래스에서 생성된 각각의 인스턴스는 각각 다른 이름, 학번, 학년등의 값을 가지게 됨
        // 생성된(new) 인스턴스는 동적 메모리(heap memory) 에 할당됨
        // 자바에서 Gabage Collector 가 주기 적으로 사용하지 않늠 메모리를 수거
        // 하나의 클래스로 부터 여러개의 서로다른 인스턴스가 생성되고 각각 다른 메모리 주소,공간을 가지게 됨
        // 해당 객체 주소를 가진 변수는 스택에, 실제 객체는 힙에 있다.

        Student studentLee = new Student(); // new 키워드를 사용하여 인스턴스 생성
        studentLee.studentName = "이순신";
        studentLee.address = "서울";


        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "경주";

        studentKim.showStudentInfo();

        System.out.println(studentLee.toString()); // 기본적으로 해당 객체의 클래스 풀네임 + JVM이 준 객체의 가상 참조(접근)주소 (16진수 해시주소) 정보가 출력
        System.out.println(studentKim);

        Student student = new Student(1, "name1", "address1");
    }

}

//    객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
//    클래스 : 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태
//    인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
//    멤버 변수 : 클래스의 속성, 특성
//    메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
//    참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
//    참조 값 : 생성된 인스턴스의 메모리 주소 값