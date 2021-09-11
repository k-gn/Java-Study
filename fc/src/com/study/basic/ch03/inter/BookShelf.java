package com.study.basic.ch03.inter;

// 클래스 상속과 인터페이스 구현 함께 쓰기
// 실무에서 프레임워크나 오픈소스와 함께 연동되는 구현을 하게 되면 클래스 상속과 인터페이스의 구현을 같이 사용하는 경우가 많음
// 이미 잘 만들어진 클래스를 확장하기 위해 상속을 받고, 해당 클래스에서 구현해야 하는 기능이 선언되어있는 인터페이스를 구현
public class BookShelf extends Shelf implements Queue {

    // 책이 순서대로 대여가 되는 도서관 구현
    // 책을 보관하는 자료 구조가 Shelf(선반)에 구현됨 (ArrayList)
    // Queue 인터페이스를 구현하여 책을 대여 / 반납 처리 구현
    // Shelf 클래스를 상속 받고 Queue를 구현한다.
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }

}
