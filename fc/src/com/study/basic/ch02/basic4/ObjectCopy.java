package com.study.basic.ch02.basic4;

import java.util.Arrays;

public class ObjectCopy {

    public static void main(String[] args) {

        // System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드

        // # 얕은 복사
        // 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정 됨
        // 즉, 두 배열이 같은 객체를 가리킴

        Book[] library = new Book[5];
        Book[] copyLibaray = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibaray, 0, 5);

        System.out.println("======copy library=========");
        for( Book book : copyLibaray ) {
            book.showBookInfo();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("======library=========");
        for( Book book : library) {
            book.showBookInfo();
        }

        System.out.println("======copy library=========");

        for( Book book : copyLibaray) {
            book.showBookInfo();
        }

        System.out.println("===============================================================");
        // 기본 배열 복사
        
        // 얕은 복사
//        int[] a = { 1, 2, 3, 4 };
//        int[] b = a;

        // Array.clone()을 사용하면 배열을 쉽게 복사할 수 있다. (깊은 복사) 가장 보편적인 방법
        int[] a = { 1, 2, 3, 4 };
        int[] b = a.clone();

        // Arrays 클래스는 배열을 조작할 수 있는 메소드를 가진 클래스
        // 이 클래스 안에 있는 Arrays.copyOf()를 사용하면 배열의 시작점 ~ 원하는 length 까지 배열의 깊은 복사 가능
        int[] b2 = Arrays.copyOf(a, a.length);

        // Arrays.copyOf()는 배열의 처음 ~ 지정한 length 까지 복사하는 메서드였다면 Arrays.copyOfRange() 메서드는 복사할 배열의 시작점도 지정
        int[] b3 = Arrays.copyOfRange(a, 1, 3);

    }

}
