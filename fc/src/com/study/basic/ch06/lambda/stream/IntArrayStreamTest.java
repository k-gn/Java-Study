package com.study.basic.ch06.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStreamTest {
    // 새로운 연산을 수행하기 위해서는 기존의 스트림은 재사용할 수 없고 stream()메서드를 호출하여 스트림을 다시 생성해야 함
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(n->System.out.print(n + "\t"));
        System.out.println();

        int sum  = Arrays.stream(arr).sum();
        System.out.println("sum: " + sum);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum2 = list.stream().mapToInt(n->n.intValue()).sum();
        System.out.println(sum2);
    }

}
