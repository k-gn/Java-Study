package com.study.basic.ch02.basic3;

public class Student {
    // 객체 지향 프로그램에서 객체 간에는 협력이 이루어짐 (ex. 내가 커피숍에서 돈을 지불하고 점원에게 커피를 받는)
    // 협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야 함
    // 매개 변수로 객체가 전달되는 경우가 발생
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    // 버스를 탄다.
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    // 지하철을 탄다.
    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(studentName +"님의 남은 돈은 " + money + "원 입니다");
    }


}
