package com.study.basic.ch02.basic4;

public class ArrayTest {

    // 배열이란?
    // 동일한 자료형의 순차적 자료 구조
    // 인덱스 연산자[]를 이용하여 빠른 참조가 가능 (조회가 빠르고 O(N) / 수정엔 느리다 -> 중간에 값이 추가되거나 삭제되면 그 뒤에 값이 전부 조정됨 -> 성능 이슈)
    // 물리적 위치와 논리적 위치가 동일 (메모리상에 연속된 위치)
    // 배열의 순서는 0부터 시작
    // 자바에서는 여러 기능을 가진 객체 배열을 구현해놓은 ArrayList를 많이 활용함

    public static void main(String[] args) {
        // 선언과 초기화
        // 배열은 선언과 동시에 자료형에 따라 초기화 됨 ( 정수는 0, 실수는 0.0, 객체는 null ... )
        int[] arr1 = new int[10];
        int arr2[] = new int[10];
        int[] numbers1 = new int[] {10, 20, 30};  // 개수 생략해야 함
        int[] numbers2 = {10, 20, 30};            // new int[]  생략 가능
        int[] ids;
        ids = new int[] {10, 20, 30};            // 선언후 배열을 생성하는 경우는 new int[] 생략할 수 없음

        int[] arr = new int[10];
        int total = 0;

        // 반복문에 배열 사용해보기
        for(int i=0, num=1; i< arr.length; i++, num++) {
            arr[i] = num;
        }

        for( int i =0; i<arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);

        for(int num : arr) {
            System.out.println(num);
        }

        // 배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이타)가 없는 경우도 있음
        // 배열의 length 속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다름
        double[] dArr = new double[5];

        dArr[0] = 1.1;
        dArr[1] = 2.1;
        dArr[2] = 3.1;

        double mtotal = 1;
        for(int i = 0; i< dArr.length; i++) {
            mtotal *= dArr[i];
        }

        System.out.println(mtotal);

        // 요소의 개수에 대한 변수(count)를 따로 유지
//        double[] dArr = new double[5];
//        int count = 0;
//        dArr[0] = 1.1; count++;
//        dArr[1] = 2.1; count++;
//        dArr[2] = 3.1; count++;
//
//        double mtotal = 1;
//        for(int i = 0; i< count; i++) {
//            mtotal *= dArr[i];
//        }
//
//        System.out.println(mtotal);


    }
    
}
