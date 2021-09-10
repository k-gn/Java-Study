package com.study.basic.ch02.basic4;

public class BookArrayTest {

    public static void main(String[] args) {
        // 기본 자료형 배열은 선언과 동시에 배열의 크기만큼의 메모리가 할당되지만,
        // 객체 배열의 경우엔 요소가 되는 객체의 주소가 들어갈(4바이트, 8바이트) 메모리만 할당되고(null) 각 요소 객체는 생성하여 저장해야 함
        Book[] library = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        for(int i =0; i<library.length; i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
        }

    }

}
