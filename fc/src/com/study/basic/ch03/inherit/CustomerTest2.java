package com.study.basic.ch03.inherit;

public class CustomerTest2 {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        int priceNo = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo  + "원 입니다.");
    }
}

// 자바에서는 항상 실제 인스턴스의 메서드가 호출 됨 (가상메서드의 원리)
// 자바의 모든 메서드는 가상 메서드(virtual method) 임

// # 메서드는 어떻게 호출되고 실행 되는가?
// 메서드(함수)의 이름은 주소값을 나타냄
// 메서드는 명령어의 set 이고 프로그램이 로드되면 메서드 영역(코드 영역)에 명령어 set이 위치
// 해당 메서드가 호출 되면 명령어 set 이 있는 주소를 찾아 명령어가 실행됨
// 이때 메서드에서 사용하는 변수들은 스택 메모리에 위치 하게됨
// 메소드의 기능은 인스턴스마다 똑같기 때문에 따로 생성되지 않음
// 인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만 (변수는 인스턴스마다 다를 수 있어서, 메서드 명령어 set은 처음 한번만 데이터 영역에 로드 됨

// 가상 메서드 테이블(vitual method table)에서 해당 클래스의 메서드에 대한 address를 가지고 있음
// 재정의된 경우는 재정의된 메서드의 주소를 가리킴

// 다시 메모리 구조를 간단히 정리하자면
// 스택 - 함수의 지역변수나 매개변수 저장
// 힙 - 인스턴스 저장
// 데이터(메소드) - 클래스 정보, 정적 데이터 저장