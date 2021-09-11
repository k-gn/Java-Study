package com.study.basic.ch03.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 필요한 경우 오버라이딩해서 사용할 메소드 (훅 메소드, 개인적으론.. 굳이..?)
    public void wash() {}

    // # 템플릿 메서드
    // 추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
    // final로 선언하여 하위 클래스에서 재정의 할 수 없게 함
    // 프레임워크에서 많이 사용되는 설계 패턴
    // 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의 하고 하위 클래스에서
    // 다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현 하도록 함

    // 프레임워크 : 프로그램의 제어권 (흐름)이 프로그래머한테 없음, 만들어진 기본 뼈대(틀 - 여러 생성과정이나 소멸과정 등의 일들은 정해져 있다.)에
    //            프로그래머가 들어와서 구체적인 작업을 수행
    // 라이브러리 : 프로그램의 제어권 (흐름)은 프로그래머가 가지고 있고, 프로그래머가 필요할 때 가져와 사용하는 기능 묶음

    // final 예약어
    // final 변수 : 값이 변경될 수 없는 상수
    // public static final double PI = 3.14;
    // final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드
    // final 클래스 : 상속할 수 없는 클래스

    // 기존에 상수를 표현할 때는 해당 클래스 내부에 final static String, final static int와 같이 정의
    // 하지만 이처럼 정의하는 방식은 상수가 많아질 경우 가독성이 떨어지고, 어떤 것에 관한 상수인지 파악하기가 어렵다.
    // Enum은 Eumeration로 열거형이라고 불리며, 서로 연관된 상수들의 집합을 의미
    // enum 상수 하나당 인스턴스가 만들어지며, 각각 public static final
    // Typesafe 하다. 가독성이 좋다.
    // 필요한 원소를 컴파일 타임에 다 알 수 있는 상수 집합이라면 항상 열거 타입을 사용하자


    // template
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        wash();
    }

}
