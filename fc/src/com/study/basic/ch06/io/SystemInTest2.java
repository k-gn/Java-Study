package com.study.basic.ch06.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

    public static void main(String[] args) {
        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            InputStreamReader irs = new InputStreamReader(new BufferedInputStream(System.in)); // 보조스트림 사용
//            while( (i = System.in.read()) != '\n' ) {
            while( (i = irs.read()) != '\n' ) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
