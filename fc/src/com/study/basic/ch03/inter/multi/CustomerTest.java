package com.study.basic.ch03.inter.multi;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.sayHello();

        // 클라이언트에게 어떤 인터페이스 타입을 오픈해주냐에 따라 사용가능한 기능의 범위를 제한할 수 있음
        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        buyer.order();
        seller.order();

    }

}
