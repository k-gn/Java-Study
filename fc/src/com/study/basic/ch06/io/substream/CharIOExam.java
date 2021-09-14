package com.study.basic.ch06.io.substream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //키보드로 입력받은 문자열을 저장하기 위해 line변수를 선언
        String line = null;
        try {
            line = br.readLine();
            System.out.println(line);
            line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //콘솔에 출력
    }
}
