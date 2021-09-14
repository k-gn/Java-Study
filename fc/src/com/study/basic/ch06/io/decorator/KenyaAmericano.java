package com.study.basic.ch06.io.decorator;

// Concrete class (추상 클래스가 아닌 클래스)
public class KenyaAmericano extends Coffee{

    @Override
    public void brewing() {
        System.out.print("KenyaAmericano ");
    }

}
