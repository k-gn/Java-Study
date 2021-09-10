package com.study.basic.ch02.basic3;

public class Car {

    private static int carNum = 10000;

    public Car() {
        carNum++;
    }

    public static int getCarNum() {
        return carNum;
    }
}
