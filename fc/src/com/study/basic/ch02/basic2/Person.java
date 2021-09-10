package com.study.basic.ch02.basic2;

public class Person {

    // # this
    // 인스턴스 자신의 메모리를 가리킴
    // 생성자에서 또 다른 생성자를 호출 할때 사용
    // 자신의 주소(참조값)을 반환 함
    String name;
    int age;

    public Person() {
        // 클래스에 생성자가 여러 개 인경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
        // 단, 맨 윗줄에 써야한다. (생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없음)
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.age = 37;

        Person p2 = p.getPerson();
        p2.name = "James";
        // p의 주소를 리턴하기 때문에 서로 같은 객체가 된다.
        System.out.println(p);
        System.out.println(p2);

    }


}
