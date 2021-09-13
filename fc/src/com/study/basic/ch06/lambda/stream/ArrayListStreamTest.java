package com.study.basic.ch06.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

// # 중간 연산과 최종 연산
// 중간 연산의 예 - filter(), map(), sorted() 등
// 조건에 맞는 요소를 추출(filter)하거나 요소를 변환 함(map)
// 최종 연산이 호출될 때 중간 연산이 수행되고 결과가 생성 됨
// 문자열 리스트에서 문자열의 길이가 5 이상인 요소만 출력하기
// sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s)); (filter()는 중간 연산이고, forEach()는 최종 연산임)
// 고객 클래스 배열에서 고객 이름만 가져오기
// customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s)); (map()은 중간 연산이고, forEach()는 최종 연산임)
// 중간 연산과 최종 연산에 대한 구현은 람다식을 활용함
// 최종 연산의 예 - forEach(), count(), sum() 등
// 스트림이 관리하는 자료를 하나씩 소모해가며 연산이 수행 됨
// 최종 연산 후에 스트림은 더 이상 다른 연산을 적용할 수 없음
// forEach() : 요소를 하나씩 꺼내 옴
// count() : 요소의 개수
// sum() : 요소들의 합
public class ArrayListStreamTest {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s->System.out.print(s + " "));
        System.out.println();

        sList.stream().sorted().forEach(s->System.out.print(s+ " "));
        sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
        sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));

        Stream<String> stream1 = StreamSupport.stream(stream.spliterator(), false);
    }

}
