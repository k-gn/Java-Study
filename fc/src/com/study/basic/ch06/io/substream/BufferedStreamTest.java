package com.study.basic.ch06.io.substream;

import java.io.*;
import java.net.Socket;

// BufferedInputStream과 BufferedOutputStream
// 약 8k의 배열(버퍼)이 제공되어 입출력이 빠르게 하는 기능이 제공되는 보조 스트림 (속도 향상)
// BufferedReader와 BufferedWriter는 문자용 입출력 보조 스트림
public class BufferedStreamTest {

    public static void main(String[] args) throws IOException {

        long millisecond = 0;
        try(FileInputStream fis = new FileInputStream("a.zip");
            FileOutputStream fos = new FileOutputStream("copy.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            millisecond = System.currentTimeMillis();

            int i;
            while( ( i = bis.read()) != -1){
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;
        }catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");

        Socket socket = new Socket();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String name = br.readLine();
    }

}
