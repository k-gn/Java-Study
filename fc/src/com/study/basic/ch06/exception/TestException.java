package com.study.basic.ch06.exception;

// 사용자 정의 에러
// 자바에서 제공되는 예외 클래스외에 프로그래머가 직접 만들어야 하는 예외가 있을 수 있음
// 기존 예외 클래스중 가장 유사한 예외 클래스에서 상속 받아 사용자 정의 예외 클래스를 만든다.
// 기본적으로 Exception 클래스를 상속해서 만들 수 있음
public class TestException extends RuntimeException {

    public TestException() {
        super("테스트 에러 입니다.");
    }
}
