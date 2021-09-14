package com.study.basic.ch06.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

    public static void main(String[] args) {

        // 파일의 끝까지 한 바이트씩 자료 읽기
        try(FileInputStream fis = new FileInputStream("input.txt")){
            int i;
            while ( (i = fis.read()) != -1){
                System.out.println(i);
                System.out.println((char)i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
