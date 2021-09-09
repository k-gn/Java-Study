package com.study.basic.ch02.basic;

public class Person {

    public String name;
    public int age;
    public int height;
    public int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void showPersonInfo() {
        System.out.printf("키가 %d 이고, 몸무개가 %d 킬로인 남성이 있습니다. 이름은 %s 이고 나이는 %d 세 입니다.", height, weight, name, age);
    }
}
