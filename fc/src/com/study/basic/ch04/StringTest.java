package com.study.basic.ch04;

public class StringTest {

    public static void main(String[] args) {

        // String 선언
        // 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법
        // 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열 리터럴은 모두 같은 주소 값을 가짐
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);

        // 한번 생성된 String은 불변(immutable)
        // String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨 ( 메모리 낭비가 발생할 수도 )
        // 다시 말해, 기존 주소와 연결을 끊고, 새로 수정된 문자열이 메모리에 생성되어 주소와 연결됨
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java));

    }

}
