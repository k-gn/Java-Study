package com.study.basic.ch06.innerclass;

// # 익명 내부 클래스
// 이름이 없는 클래스
// 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
// 인터페이스나 추상 클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환 할 수 있음.
// 클래스의 선언과 동시에 객체를 생성하므로, 단 하나의 객체만을 생성하는 일회용 클래스
// 생성자를 가질 수 없음
// 매우 제한적인 용도에 사용되며, 구현해야 하는 메소드가 매우 적은 클래스를 구현할 때 사용
// 부모 클래스를 상속받는 서브 클래스를 생성하지 않고도, 단일 객체를 만들어서 부모 클래스에 정의된 동작에서 행위를 추가할 수 있다
// - Oracle 에서는 다음과 같이 익명클래스 소개하고 있다.
// 1. 익명 클래스를 사용하면 코드가 간결해진다.
// 2. 선언과 동시에 초기화가 가능하다.
// 3. 이름이 없다는 것을 제외하면, 지역 클래스와 같다.
// 4. 지역 클래스를 한 번만 사용해야 한다면, 익명 클래스를 사용해라.
// 람다식에서도 사용하고 있다.
// new [구현 또는 추상클래스명] { 구현 내용 }
class Outter2{

    Runnable getRunnable(int i){

        int num = 100;

        return new Runnable() {

            @Override
            public void run() {
                //num = 200;   //에러 남
                //i = 10;      //에러 남
                System.out.println(i);
                System.out.println(num);
            }
        };
    }

    Runnable runner = new Runnable() {

        @Override
        public void run() {
            System.out.println("Runnable 이 구현된 익명 클래스 변수");

        }
    };
}

public class AnonymousInnerTest {

    public static void main(String[] args) {
        Outter2 out = new Outter2();

        Runnable runnerble = out.getRunnable(10);
        runnerble.run();

        out.runner.run();
    }
}
