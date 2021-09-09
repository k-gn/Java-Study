package com.study.basic.ch01;

public class ConstantTest {

    public static void main(String[] args) {

        // 상수 - 변하지 않는 수
        // 원주율, 1년은 12개월 등
        // final 사용
        // 상수명은 대문자와 스네이크 케이스 사용 권장
        // 그냥 숫자보다 가독성이 좋음
        // 초기화 필요
        final int MAX_NUM = 100;

        // 형변환
        // 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
        // 묵시적, 명시적이 있음
        // 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동
        // 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동

        int num = 20;
        double dnum = num;

        int num2 = (int) 1.2; // 명시적은 값 손실이 일어날 수 있다.

        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum + (int)fNum;
        int iNum2 = (int)(dNum + fNum);

    }

    // 리터럴
    // - 프로그램에서 사용하는 숫자, 문자, 논리값
    // - 상수풀에 있음 (상수풀은 프로그래밍 로드 시 메소드영역에 올라간다)
    // 정수는 int, 실수는 double이 기본 리터럴 타입
    
    // 관계 연산자에서 쇼트서킷 조심
}
