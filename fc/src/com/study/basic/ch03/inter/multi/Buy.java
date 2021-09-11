package com.study.basic.ch03.inter.multi;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("구매 주문");
    }

}
