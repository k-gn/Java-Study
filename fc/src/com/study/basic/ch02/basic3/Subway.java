package com.study.basic.ch02.basic3;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) { // 승차 처리
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }

}
