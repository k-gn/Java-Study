package com.study.basic.ch04;

public class StringBuilderTest {

    // StringBuilder, StringBuffer 활용하기
    // 기존에 String 메모리 문제를 해결 가능 (= 불변이 아니다)
    // 문자열을 여러번 연결하거나 변경할 때 사용하면 유용함
    // 내부적으로 가변적인 char[]를 멤버 변수로 가짐
    // 새로운 인스턴스를 생성하지 않고 char[] 를 변경함
    // StringBuffer 는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)을 보장
    // 동기화 - 어느 메소드가 실행하는 동안 다른 메소드를 실행이 불가능하게 블락하는 것, 두개 이상의 쓰레드가 같은 메모리에 접근할 때 순서가 생긴다
    //         (작업을 요청한 후 해당 작업의 결과가 나올 때까지 기다린 후 처리하는 것)
    // 단일 쓰레드 프로그램에서는 StringBuilder 사용을 권장 (속도가 더 빠르다.)
    // toString() 메서드로 String 반환

    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));

        java = buffer.toString();
        System.out.println(java);
    }

}
