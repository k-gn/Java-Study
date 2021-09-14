package com.study.basic.ch06.io.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    public static void main(String[] args) {

        // 파일에서 바이트 배열로 자료 읽기 ( 배열에 남아 있는 자료가 있을 수 있음에 유의 )
        try (FileInputStream fis = new FileInputStream("input.txt")){

            byte[] bs = new byte[10];
            int i;
            while ( (i = fis.read(bs)) != -1){ // 배열 크기만큼 한번에 읽고 읽은 개수를 반환, 없으면 -1
				/*for(byte b : bs){
					System.out.print((char)b);
				}*/
                System.out.println(i);
                for(int k= 0; k<i; k++){
                    System.out.print((char)bs[k]);
                }
                System.out.println(": " +i + "바이트 읽음" );
            }

			/*while ( (i = fis.read(bs, 1, 9)) != -1){
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(": " +i + "바이트 읽음" );
			}*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
