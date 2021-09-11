package com.study.basic.ch03.inter.inherit;

public class MyClassTest {

    public static void main(String[] args) {

        MyClass mClass = new MyClass();

        X xClass = mClass;
        xClass.x();


        Y yClass = mClass;
        yClass.y();

        MyClass iClass = mClass;
        iClass.x();
        iClass.y();
        iClass.myMethod();
    }

}
