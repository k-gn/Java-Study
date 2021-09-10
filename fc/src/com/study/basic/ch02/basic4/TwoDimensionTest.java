package com.study.basic.ch02.basic4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoDimensionTest {

    // 이차원 이상으로 구현 된 배열
    // 평면 (이차원 배열) 이나 공간(삼차원 배열)을 활용한 프로그램 구현
    public static void main(String[] args) {
        // [행][열] (실제로 메모리에선 1열로 잡힌다)
        int[][] arr = { {1,2,3}, {4,5,6,7}};
        int i, j;

        for(i=0; i<arr.length; i++) { // 행 (기준)
            for(j=0; j<arr[i].length; j++) { // 열
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(", \t" + arr[i].length);
            System.out.println();
        }

        Integer[] iArr = {1, 2, 3};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, iArr);
        System.out.println(list);
//        list.addAll(Arrays.stream(iArr).toList());
//        System.out.println(list);

        // List.of 나 Arrays.asList 로 만든 배열은 수정 불가능
//        List<Integer> copyList = List.of(4, 5, 6);
//        List<Integer> copyList = Arrays.asList(4, 5, 6);
        List<Integer> copyList = new ArrayList<>();
        copyList.add(4);
        copyList.add(5);
        copyList.add(6);
        copyList.add(7);
        Collections.copy(copyList, list);
        System.out.println(copyList);
    }

}
