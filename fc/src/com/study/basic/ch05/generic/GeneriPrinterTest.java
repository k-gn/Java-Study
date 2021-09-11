package com.study.basic.ch05.generic;

public class GeneriPrinterTest {

    public static void main(String[] args) {

        // 다이아몬드 연산자 <>
        // 에서 <>를 다이아몬드 연산자라 함
        // 제네릭에서 자료형 추론 가능(자바 10부터)
        // ArrayList list = new ArrayList() => var list = new ArrayList();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // 뒤에 다이아몬든 연산자 내부에서 자료형은 생략가능 함
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);

    }
}
