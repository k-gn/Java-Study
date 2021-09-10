package com.study.basic.ch02.basic;

public class OrderTest {

    public static void main(String[] args) {

        // 참조 자료형
        // 클래스형으로 변수를 선언
        // 기본 자료형은 사용하는 메모리의 크기가 정해져 있지만, 참조 자료형은 클래스에 따라 다름
        // 참조 자료형을 사용 할때는 해당 변수에 대해 생성하여야 함
        // (String 클래스는 예외적으로 생성하지 않고 사용할 수 있음)

        Order order = new Order(
                1,
                "01012341234",
                "서울",
                1000,
                1,
                "000000",
                "20210000"
        );

        Person person = new Person(
                "홍길동",
                25,
                180,
                65
        );

        person.showPersonInfo();
        order.showOrderInfo();

    }
}
