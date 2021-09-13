package com.study.basic.ch06.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    // try-catch-finally 문
    // finally 블럭에서 파일를 닫거나 네트웍을 닫는 등의 리소스 해제 구현을 함
    // try{} 블럭이 수행되는 경우, finally{} 블럭은 항상 수행 됨
    // 여러 개의 예외 블럭이 있는 경우 각각에서 리소스를 해제하지 않고 finally 블록에서 해제하도록 구현함

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            //return;
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행 됩니다.");
        }
        System.out.println("여기도 수행됩니다.");
    }

}
