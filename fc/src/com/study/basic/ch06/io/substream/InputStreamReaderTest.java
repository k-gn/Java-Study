package com.study.basic.ch06.io.substream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 보조 스트림
// 실제 읽고 쓰는 스트림이 아닌 보조 기능을 제공하는 스트림
// FilterInputStream과 FilterOutputStream이 보조 스트림의 상위 클래스들
// 생성자의 매개변수로 또 다른 스트림(기반 스트림이나 다른 보조 스트림)을 가짐
// 기반 스트림이나 또다른 보조스트림을 감싸고 있다.
// Decorator Pattern으로 구현 됨 (여러 부가적인 기능들이 조합될 수 있게끔 해준다)

// protected FilterInputStream(InputStream in)
// public FilterOutputStream(OutputStream out)

// # InputStreamReader와 OutputStreamWriter
// 바이트 단위로 읽거나 쓰는 자료를 문자로 변환해주는 보조 스트림
public class InputStreamReaderTest {

    public static void main(String[] args) {

//        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            int i;
//            while( (i = isr.read()) != -1 ){  // 보조 스트림으로 읽습니다.
//                System.out.print((char)i);
//            }
            while( (i = isr.read()) != '\n' ){  // 보조 스트림으로 읽습니다.
                System.out.print((char)i);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}
