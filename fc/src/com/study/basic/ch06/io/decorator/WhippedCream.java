package com.study.basic.ch06.io.decorator;

public class WhippedCream extends Decorator{

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.print("Adding WhippedCream ");
    }

}
