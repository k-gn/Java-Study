package com.study.basic.ch06.io.decorator;

public class Latte extends Decorator{

    public Latte(Coffee coffee) {
        super(coffee);
    }


    public void brewing() {
        super.brewing();
        // 추가 기능
        System.out.print("Adding Milk ");
    }

}
