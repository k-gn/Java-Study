package com.study.basic.ch06.io.substream;

import java.io.*;

public class DataStreamTest {

    public static void main(String[] args) {

        // DataInputStream과 DataOutputStream
        // 자료가 메모리에 저장된 상태 그대로 읽거나 쓰는 스트림 (타입을 그대로)
        try(FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos))
        {

            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        }catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis))
        {

            // 단, 순서대로 써야함
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
