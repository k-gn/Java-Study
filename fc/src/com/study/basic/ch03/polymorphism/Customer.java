package com.study.basic.ch03.polymorphism;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio; // 적립률

    // 만약 여기에 vip 특성도 넣어 버리면 일반 고객일 경우 필요없는 정보들이기 때문에 클래스의 단일성이 망가지고, 복잡해진다.
    // 또한 차 후 또다른 정책이 추가될 경우 힘들어진다.
    // 일반 고객과 VIP 고객은 공통점이 많지만 서로 다른 존재 => 기존 Customer가 더 구체화됨 => 상속을 고려!
    // 기존 코드는 건드리지 않고, 추가로 생성한다.

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
//        System.out.println("Customer(int, String) 생성자 호출");
    }

    // 지불할 금액을 알려주는 메소드
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는" + bonusPoint + "입니다";

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
