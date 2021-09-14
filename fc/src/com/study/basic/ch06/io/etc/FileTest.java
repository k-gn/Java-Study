package com.study.basic.ch06.io.etc;

import java.io.File;
import java.io.IOException;

public class FileTest {

    // File 클래스
    // 파일 개념을 추상화한 클래스
    // 입출력 기능은 없고, 파일의 이름, 경로, 읽기 전용등의 파일 속성을 알수 있음
    // 이를 지원하는 여러 메서드들이 제공됨
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\myProject\\newFile.txt"); // 디렉토리 경로는 있어야한다.
        file.createNewFile(); // 파일 생성

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.delete(); // 파일 삭제
    }

}
