package com.study.basic.ch06.lambda;

public class LambdaTest2 {
    public static void main(String[] args) {

        // 인터페이스형 변수에 람다식 대입하기
        PrintString lambdaStr = s->System.out.println(s);
        lambdaStr.showString("hello lambda_1");

        // 매개변수로 전달하는 람다식
        showMyString(lambdaStr);

        PrintString reStr = returnString();
        reStr.showString("hello ");

    }

    public static void showMyString(PrintString p) {
        p.showString("hello lambda_2");
    }

    // 반환 값으로 쓰이는 람다식
    public static PrintString returnString() {
        return s->System.out.println(s + "world");
    }

}
