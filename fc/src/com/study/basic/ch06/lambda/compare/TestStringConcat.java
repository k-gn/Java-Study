package com.study.basic.ch06.lambda.compare;

public class TestStringConcat {

    // 객체 지향 프로그래밍과 람다식 비교
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";
        StringConCatImpl concat1 = new StringConCatImpl();
        concat1.makeString(s1, s2);

        // 람다식으로 구현하기
        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v); //System.out.println(i);
        concat2.makeString(s1, s2);

        // 익명 객체를 생성하는 람다식
        // 자바에서는 객체 없이 메서드가 호출 될 수 없음
        // 람다식을 구현하면 익명 내부 클래스가 만들어지고, 이를 통해 익명 객체가 생성됨
        // 익명 내부 클래스에서와 마찬가지로 람다식 내부에서 외부에 있는 지역 변수의 값을 변경하면 오류가 발생함
        StringConcat concat3 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println( s1 + "," + s2 );
            }
        };
        concat3.makeString(s1, s2);

    }
}
