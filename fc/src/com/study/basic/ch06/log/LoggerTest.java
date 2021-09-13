package com.study.basic.ch06.log;

public class LoggerTest {

    public static void main(String[] args) {

        MyLogger myLogger = MyLogger.getLogger();

        myLogger.log("test");
    }

}
