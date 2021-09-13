package com.study.basic.ch06.io;

import java.io.IOException;

public class SystemInTest1 {

    public static void main(String[] args) {
        // System.out
        // 표준 출력(모니터) 스트림
        // System.out.println("출력 메세지");
        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            // System.in
            // 표준 입력(키보드) 스트림
            // int d = System.in.read() // 한 바이트 읽기
            i = System.in.read();
            System.out.println(i);
            System.out.println((char)i);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // System.err
            // 표준 에러 출력(모니터) 스트림
            // System.err.println("에러 메세지");
            System.err.println(e.getMessage());
        }

    }

}
