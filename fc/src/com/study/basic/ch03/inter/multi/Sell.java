package com.study.basic.ch03.inter.multi;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("판매 주문");
    }

}
