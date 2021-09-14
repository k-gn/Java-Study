package com.study.basic.ch06.io.decorator;

// # Decorator Pattern
// 자바의 입출력 스트림은 decorator pattern 임
// 여러 decorator들을 활용하여 다양한 기능을 제공
// 상속 보다 유연한 구현 방식, 기능 확장 용이 (단순히 데코레이터를 추가하면 기능이 추가, 삭제되면 기능이 삭제)
// 데코레이터는 다른 데코레이터나 또는 컴포넌트를 포함해야 함
// 지속적인 기능의 추가와 제거가 용이함
// 기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에
// 각 추가 기능을 Decorator 클래스로 정의 한 후 필요한 Decorator 객체를 조합함으로써 추가 기능의 조합을 설계 하는 방식
// decorator와 component는 동일한 것이 아님 (기반 스트림 클래스가 직접 읽고 쓸수 있고, 보조 스트림은 추가적인 기능 제공하는 것처럼)
public abstract class Decorator extends Coffee { // 컴포넌트를 상속받음, 구체적인 데코레이터들의 공통 기능을 제공

    // 커피로 치면 실제 커피 원두가 컴포넌트고, 휘핑 크림이나 시럽같은게 데코레이트
    // 기본적으로 컴포넌트를 내부에 가지고, 해당 컴포넌트가 하는 기능을 호출하면서 추가적인 기능을 제공
    Coffee coffee;
    public Decorator(Coffee coffee){ // 항상 생성자에서 컴포넌트를 하나이상 포함해야함
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }

}
