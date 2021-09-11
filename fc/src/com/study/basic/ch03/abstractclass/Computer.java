package com.study.basic.ch03.abstractclass;

// # 추상 클래스란?
// 구현 코드 없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스
// 상속을 하기위한 목적으로 만든 클래스다.
// 메서드 선언(declaration) : 반환타입, 메서드 이름, 매개변수로 구성
// 메서드 정의(definition) : 메서드 구현(implementation)과 동일한 의미 구현부(body) 를 가짐 ({ })
// 예) int add(int x, int y); // 선언
// int add(int x, int y){ } // 구현부가 있음, 추상 메서드 아님
// abstract 예약어를 사용
// 추상 클래스는 new 할 수 없음 ( 인스턴스화 할 수 없음 )

// 어떠한 메서드를 선언한다는 것 = 이 메소드가 무슨 일을 할지를 이미 머리속에 생각해두고 있다.

// # 구현 방법
// 메서드에 구현 코드가 없으면 abstract 로 선언
// abstract로 선언된 메서드를 가진 클래스는 abstract로 선언
// 모든 메서드가 구현 된 클래스라도 abstract로 선언되면 추상 클래스로 인스턴스화 할 수 없음
// 추상 클래스의 추상 메서드는 하위 클래스가 상속 하여 구현
// 추상 클래스 내의 추상 메서드 : 하위 클래스가 구현해야 하는 메서드
// 추상 클래스 내의 구현 된 메서드 : 하위 클래스가 공통으로 사용하는 메서드 ( 필요에 따라 하위 클래스에서 재정의 함 )
public abstract class Computer {

    // 구현할 수 있는 메소드는 공통 메소드
    // 구현하지 못할 메소드는 추상 메소드 -> 하위 클래스가 구현하도록 강제할 수 있다. (책임을 위임)
    // 난 선언만 할테니 알아서들 구현해~
    // 상속받은 객체간의 동일한 메소드명으로 각각 다른 기능을 구현(핵심은 같은데 각각 다른 메소드명으로 구현하면 불편)
    // 자바에서 추상 메소드를 선언하여 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함

    abstract void display();
    abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

}
