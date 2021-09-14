package com.study.basic.ch06.io.etc;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        String name = scanner.next();
        System.out.println(name);
    }
}
