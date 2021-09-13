package com.study.basic.ch06.lambda.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

// # 스트림 이란?
// 자료의 대상과 관계없이 동일한 연산을 수행
// 배열, 컬렉션을 대상으로 연산을 수행 함 (배열과 컬렉션을 함수형으로 처리)
// 일관성 있는 연산으로 자료의 처리를 쉽고 간단하게 함
// 자료 처리에 대한 추상화가 구현되었다고 함
// 한번 생성하고 사용한 스트림은 재사용 할 수 없음
// 자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모됨
// 다른 연산을 수행하기 위해서는 스트림을 다시 생성해야 함
// 스트림 연산은 기존 자료를 변경하지 않음
// 자료에 대한 스트림을 생성하면 스트림이 사용하는 메모리 공간은 별도로 생성되므로 연산이 수행되도 기존 자료에 대한 변경은 발생하지 않음
// 스트림 연산은 중간 연산과 최종 연산으로 구분 됨
// 스트림에 대해 중간 연산은 여러 개의 연산이 적용될 수 있지만 최종 연산은 마지막에 한 번만 적용됨
// 최종연산이 호출되어야 중간 연산에 대한 수행이 이루어 지고 그 결과가 만들어짐
// 따라서 중간 연산에 대한 결과를 연산 중에 알수 없음 -> 이를 '지연 연산'이라 함

// 데이터의 흐름
// 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자
// Iterator와 비슷한 역할을 하지만 람다식으로 요소 처리 코드를 제공하여 코드가 좀 더 간결하게 할 수 있다는 점과 내부 반복자를 사용하므로 병렬처리가 쉽다
// 불필요한 코딩(for, if 문법)을 걷어낼 수 있고 직관적이기 때문에 가독성이 좋아진다. (간단하게 람다식을 활용해 일관성 있게 처리)
// Collections같은 객체 집합.스트림생성().중개연산().최종연산();" 이런식 (선언, 가공, 반환)
public class IntArrayTest {

    public static void main(String[] args) {
        // 정수 배열에 스트림 생성하여 연산을 수행 하는 예
        int[] arr = {1,2,3,4,5};
        
        double[] darr = {1.0, 1.1, 1.2};
        IntStream stream = Arrays.stream(arr);
        DoubleStream stream1 = Arrays.stream(darr);
        int sumVal = Arrays.stream(arr).sum();
        long count = Arrays.stream(arr).count();

        System.out.println(sumVal);
        System.out.println(count);
    }

}
