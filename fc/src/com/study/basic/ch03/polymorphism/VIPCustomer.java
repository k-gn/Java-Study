package com.study.basic.ch03.polymorphism;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    // # super
    // 하위 클래스에서 가지는 상위 클래스에 대한 참조 값
    // super()는 상위 클래스의 기본 생성자를 호출 함
    // 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 자동으로 super()가 호출 됨
    // (이때 반드시 상위 클래스의 기본 생성자가 존재 해야 함)
    // 상위 클래스의 기본 생성자가 없는 경우 ( 다른 생성자가 있는 경우 ) 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출 함
    // super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근할 수 있음

    public VIPCustomer() {
        customerGrade = "VIP";    //오류 발생
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;
//        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }

    // 오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
    // 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음 (해당 클래스에서 메소드 실행 시 재정의된 메소드가 실행됨)
    // VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음 - 재정의 하여 구현해야 함 (하위 클래스에 맞는 메소드로 다시 정의 하는 것)
    // @override 애노테이션은 재정의 된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러가 남 (컴파일 에러 확인 가능)
    @Override // 애노테이션은 원래 주석이라는 의미 - 컴파일러에게 특별한 정보를 제공해주는 역할
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    //showCustomerInfo() 재정의
    @Override
    public String showCustomerInfo(){
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다";
    }

}
