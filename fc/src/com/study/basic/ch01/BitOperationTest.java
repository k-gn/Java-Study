package com.study.basic.ch01;

public class BitOperationTest {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2); // * 2n
        System.out.println(num1 >> 2); // / 2n
        System.out.println(num1 >>> 2);
    }
}
