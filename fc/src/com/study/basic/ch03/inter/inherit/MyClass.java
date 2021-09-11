package com.study.basic.ch03.inter.inherit;

public class MyClass implements MyInterface {

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

}
