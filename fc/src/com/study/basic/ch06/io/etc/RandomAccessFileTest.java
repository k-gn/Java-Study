package com.study.basic.ch06.io.etc;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    // RandomAccessFile 클래스
    // 입출력 클래스 중 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스
    // 파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함 (이동하면서 파일을 읽거나 쓸수 있음)
    // 다양한 메서드가 제공됨

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); // rw = read write
        rf.writeInt(100); // 4바이트
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        rf.writeDouble(3.14); // 4바이트 + 8바이트
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        rf.writeUTF("안녕하세요"); // .. + 17바이트 (한글이 3바이트씩 잡히고 마지막에 널포인터 2바이트)
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        rf.seek(0); // 포인터 위치 지정
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        System.out.println(rf.length());

        // 순서대로 읽어야 한다.
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }

}
