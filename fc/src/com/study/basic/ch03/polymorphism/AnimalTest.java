package com.study.basic.ch03.polymorphism;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        // # 다형성
        // 하나의 코드가 여러 자료형(타입)으로 구현되어 실행되는 것
        // 같은 코드에서 여러 다른 실행 결과가 나옴
        // 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
        // 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList) {
            animal.move();
        }

        test.testDownCasting(animalList);
    }

    public void moveAnimal(Animal animal) {
        // 같은 실행 코드지만 구현체에 따르 다른 동작을 수행한다.
        // 하위클래스들을 상위클래스 하나의 타입으로 핸들링
        animal.move();

    }

    // 다형성을 사용하는 이유?
    // 다른 동물을 추가하는 경우
    // 상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들 수 있음
    // 그렇지 않는 경우 많은 if-else if문이 구현되고 코드의 유지보수가 어려워짐
    // 상위 클래스에서는 공통적인 부분을 제공하고 하위 클래스에서는 각 클래스에 맞는 기능 구현
    // ㅍ여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 있음

    public void testDownCasting(ArrayList<Animal> list) {
        // 다운 캐스팅과 instanceof
        // 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
        // 하위 클래스로의 형 변환은 명시적으로 해야 함 (실제 인스턴스가 중요)

        // instanceof를 이용하여 인스턴스의 형 체크
        // 원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 true 아니면 false를 반환 함
//        for (int i = 0; i < list.size(); i++) {
//            Animal animal = list.get(i);
        for(Animal animal : list) {
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("error");
            }

        }
    }

}
