package com.study.basic.ch06.io.decorator;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Mocha kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMocha.brewing();
        System.out.println();

        // 다양한 기능들이 아래처럼 조합될 수 있다. (기능이 더 필요하면 데코레이터를 추가하면 된다)
        WhippedCream etiopiaWhippedMocha =
                new WhippedCream(new Mocha(new Latte( new EtiopiaAmericano())));
        etiopiaWhippedMocha.brewing();
        System.out.println();

    }

}
