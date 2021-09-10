package com.study.basic.ch02.basic4;

public class CharArrayTest {

    public static void main(String[] args) {

//        char[] alpahbets = new char[26];
//        char ch = 'A';
//
//        for(int i = 0; i<alpahbets.length; i++) {
//
//            alpahbets[i] = ch++;
//        }
//
//        for(int i = 0; i<alpahbets.length; i++) {
//            System.out.println(alpahbets[i] +","+ (int)alpahbets[i]);
//        }

        // 향상된 for문 사용하기
        char[] alpahbets = new char[26];
        char ch = 'A';

        for(int i = 0; i<alpahbets.length; i++) {

            alpahbets[i] = ch++;
        }

        for(char alpha : alpahbets) {
            System.out.println(alpha +","+ (int)alpha);
        }

    }

}
