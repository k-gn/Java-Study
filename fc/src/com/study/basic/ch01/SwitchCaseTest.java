package com.study.basic.ch01;

public class SwitchCaseTest {

    public static void main(String[] args) {
        // if - else if - else 문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현
        // 비교 조건이 특정 값이나 문자열인 경우 사용

        String medal = "Gold";

        switch(medal) {

            case "Gold":
                System.out.println("금메달 입니다.");
                break;
            case "Silver":
                System.out.println("은메달 입니다.");
                break;
            case "Bronze":
                System.out.println("동메달 입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
                break;
        }


        // Java 14 부터 지원 되는 Switch Expression
        // 간단하게 쉼표(,)로 조건 구분
        // 식으로 표현 하여 반환 값을 받을 수 있음. 리턴 값이 없는 경우는 오류가 생김
        // yield 키워드 사용

        int month = 3;

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("한 달은 31일입니다.");
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 -> {
                System.out.println("한 달은 28일입니다.");
                yield 28;
            }
            default ->
                0;
        };
        System.out.println(month + "월은 " + day + "일입니다.");

    }
}
