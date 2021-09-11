package com.study.basic.ch03.inter.multi;

// # 여러 인터페이스 구현
// 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스는 구현 할 수 있음
// 디폴트 메서드가 중복 되는 경우는 구현 하는 클래스에서 재정의 하여야 함
// 여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환 되는 경우 해당 인터페이스에 선언된 메서드만 사용 가능 함
public class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }

}
