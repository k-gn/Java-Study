package com.study.basic.ch02.basic;

public class OrderTest {

    public static void main(String[] args) {

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
