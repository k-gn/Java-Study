package com.study.basic.ch02.basic;

public class Order {

    public int orderId;
    public String orderPhone;
    public String orderAddress;
    public int price;
    public int menuId;
    public String orderTime;
    public String orderDate;

    public Order(int orderId, String orderPhone, String orderAddress, int price, int menuId, String orderTime, String orderDate) {
        this.orderId = orderId;
        this.orderPhone = orderPhone;
        this.orderAddress = orderAddress;
        this.price = price;
        this.menuId = menuId;
        this.orderTime = orderTime;
        this.orderDate = orderDate;
    }

    public void showOrderInfo() {

        System.out.println("주문 접수 번호 : " + orderId);
        System.out.println("주문 핸드폰 번호 : " + orderPhone);
        System.out.println("주문 집 주소 : " + orderAddress);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문 시간 : " + orderTime);
        System.out.println("주문 가격 : " + price);
        System.out.println("메뉴 번호 : " + menuId);
    }

}
