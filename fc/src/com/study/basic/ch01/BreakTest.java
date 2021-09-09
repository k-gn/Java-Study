package com.study.basic.ch01;

public class BreakTest {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i : " + i + ", j : " + j);
                if (j > 1) break outer;
            }
        }
    }

}
