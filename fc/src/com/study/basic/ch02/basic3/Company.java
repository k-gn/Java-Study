package com.study.basic.ch02.basic3;

// # Singleton
// 디자인 패턴(객체 지향 프로그래밍에서 좀 더 효율적으로 프로그램을 구현할 수 있는, 즉 유지보수가 쉽고 확장성이 좋은, 객체지향에 적합한 구조) 중 하나
// ex) 컴퓨터 여러대가 단 하나의 프린터를 사용, 시간은 단 하나 등등
// 프로그램에서 인스턴스가 단 한 개만 생성되는게 유리한 경우 사용하는 디자인 패턴 (즉, 유일한 객체 하나를 제공)
// static 변수, 메서드를 활용하여 구현 할 수 있음
public class Company {

    private static Company instance = new Company();

    private Company() {}

    public static Company getInstance() {

        if( instance == null) {
            instance = new Company();
        }
        return instance;

    }

}
