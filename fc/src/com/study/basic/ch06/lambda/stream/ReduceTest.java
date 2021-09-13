package com.study.basic.ch06.lambda.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// # reduce() 연산
// 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 적용
// T reduce(T identify, BinaryOperator<T> accumulator) (기본값, 함수)
// 최종 연산으로 스트림의 요소를 소모하며 연산을 수행
// 배열의 모든 요소의 합을 구하는 reduce() 연산 구현 예
// Arrays.stream(arr).reduce(0, (a,b)->a+b)); -> 기본값과 인수를 누적
// reduce() 메서드의 두 번째 요소로 전달되는 람다식에 따라 다양한 기능을 수행 할 수 있음
// 람다식을 직접 구현하거나 람다식이 긴 경우 BinaryOperator를 구현한 클래스를 사용 함
class CompareString implements BinaryOperator<String> {

    // 인수 2 개를 받아, 인수와 같은 타입의 값을 리턴하는 함수
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {

    public static void main(String[] args) {

        String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};

        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) ->
        {
            System.out.println(s1);
            System.out.println(s2);
            if (s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else return s2;
        }));

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));

        String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //BinaryOperator를 구현한 클래스를 직접 넣어도된다. (이때 Optional<T> 리턴)
        System.out.println(str);

    }
}
