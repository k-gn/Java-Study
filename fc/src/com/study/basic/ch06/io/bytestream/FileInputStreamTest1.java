package com.study.basic.ch06.io.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

    // # InputStream
    // 바이트 단위 입력 스트림 최상위 추상 클래스
    // 많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현함

    // FileInputStream
    //      파일에서 바이트 단위로 자료를 읽습니다.
    // ByteArrayInputStream
    //      byte 배열 메모리에서 바이트 단위로 자료를 읽습니다.
    // FilterInputStream
    //      기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
    public static void main(String[] args) {
        // 파일에서 한 바이트씩 자료 읽기
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");

            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());

        } catch (IOException e) {
            System.out.println(e);
        } finally{
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e){
                System.out.println(e);
            }
        }
        System.out.println("end");
    }

}

/*
    int read()
            입력 스트림으로부터 한 바이트의 자료를 읽습니다. 읽은 자료의 바이트 수를 반환합니다.

    int read(byte b[])
            입력 스트림으로 부터 b[] 크기의 자료를 b[]에 읽습니다. 읽은 자료의 바이트 수를 반환합니다.

    int read(byte b[], int off, int len)
            입력 스트림으로 부터 b[] 크기의 자료를 b[]의 off변수 위치부터 저장하며 len 만큼 읽습니다. 읽은 자료의 바이트 수를 반환합니다.

    void close()
            입력 스트림과 연결된 대상 리소스를 닫습니다.
*/
