package com.study.basic.ch03.inter;

public abstract class Calculator implements Calc { // implements 로 구현, 미완성 시 추상 클래스가 된다.

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
