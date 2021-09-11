package com.study.basic.ch03.polymorphism;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임당");
        Customer customerHong = new GoldCustomer(10030, "홍길동");
        Customer customerYul = new GoldCustomer(10040, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("====== 고객 정보 출력 =======");

        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 =======");

        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + +cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }
    }

}

// # IS-A 관계(is a relationship : inheritance)
// 일반적인(general) 개념과 구체적인(specific) 개념과의 관계
// 상위 클래스 : 하위 클래스보다 일반적인 개념 ( 예: Employee )
// 하위 클래스 : 상위 클래스보다 구체적인 개념들이 더해짐 ( 예: Engineer, Manager...)
// 상속은 클래스간의 결합도가 높은 설계
// 상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음
// 계층구조가 복잡하거나 hierarchy가 높으면 좋지 않음

// # HAS-A 관계(composition)
// 클래스가 다른 클래스를 포함하는 관계 ( 변수로 선언 )
// 코드 재사용의 가장 일반적인 방법
// Student가 Subject를 포함하는
// Library를 구현할 때 ArrayList 생성하여 사용
// 상속하지 않음