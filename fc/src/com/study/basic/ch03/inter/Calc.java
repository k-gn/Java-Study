package com.study.basic.ch03.inter;

public interface Calc {

    // # 인터페이스
    // 모든 메서드가 추상 메서드로 선언됨 public abstract
    // 모든 변수는 상수로 선언됨 public static final

    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 자바 8 부터 디폴트 메서드(default method)와 정적 메서드(static method) 기능의 제공으로 일부 구현 코드가 있음
    // 기본적(공통적)으로 가질 수 있는 기능을 제공할 수 있어짐
    // 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
    // default 키워드 사용
    // 구현 하는 클래스에서 재정의 할 수 있음
    // 인터페이스를 구현한 클래스의 인스턴스가 생성 되어야 사용 가능함
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    // 정적 메서드 (자바 8이후)
    // 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
    static int total(int[] arr) {
        int total = 0;

        for(int i: arr) {
            total += i;
        }
        mystaticMethod();
        return total;
    }

    // private 메서드 (자바 9이후)
    // 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음
    // 인터페이스 내부에서만 사용하기 위해 구현하는 메서드
    // default 메서드나 static 메서드에서 사용함
    private void myMethod() {
        System.out.println("private method");
    }

    private static void mystaticMethod() {
        System.out.println("private static method");
    }

    // # 인터페이스를 왜 쓸까?
    // 클래스나 프로그램이 제공하는 기능을 명시적으로 선언
    // 일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제공하는 명세(specification)
    // 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있음(실제로 구현된 코드를 알수도 있지만 몰라도 사용 가능)
    // 어떤 객체가 하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미임
    // 인터페이스를 구현한 다양한 객체를 쉽게 사용 가능 (여러 구현객체를 그냥 바꿀뿐, 사용하는 쪽에선 그대로 인터페이스만 보기 때문에 코드가 바뀌지않음) - 다형성
    // 다중구현 가능 (상속과 달리 모호성이 없다.)
    // 변경에 닫힌, 확장은 열린 구현이 가능
    // 예) JDBC 인터페이스
}
