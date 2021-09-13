package com.study.basic.ch06.lambda.compare;

// 인터페이스를 구현한 클래스 만들기
public class StringConCatImpl implements StringConcat{

    @Override
    public void makeString(String s1, String s2) {
        System.out.println( s1 + "," + s2 );
    }

}
