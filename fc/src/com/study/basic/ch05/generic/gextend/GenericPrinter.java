package com.study.basic.ch05.generic.gextend;

// 상위 클래스의 필요성
// T 자료형의 범위를 제한 할 수 있음
// 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있음
// 상속을 받지 않는 경우 T는 Object로 변환되어 Object 클래스가 기본으로 제공하는 메서드만 사용가능
// <K extends T>  :	 T와 T의 자손 타입만 가능 (K는 들어오는 타입으로 지정 됨)
// <K super T>	  :  T와 T의 부모(조상) 타입만 가능 (K는 들어오는 타입으로 지정 됨)
// <? extends T>  :	 T와 T의 자손 타입만 가능
// <? super T>	  :  T와 T의 부모(조상) 타입만 가능
// <?>		      :  모든 타입 가능. <? extends Object>랑 같은 의미 (와일드 카드(Wild card)), 사용 시점에 결정됨

// GenericPrinter 에 material 변수의 자료형을 상속받아 구현
// T에 무작위 클래스가 들어갈 수 없게 Material 클래스를 상속받은 클래스로 한정
public class GenericPrinter <T extends Material> {
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }

}
