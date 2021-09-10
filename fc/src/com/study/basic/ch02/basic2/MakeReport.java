package com.study.basic.ch02.basic2;

public class MakeReport {

    // # 캡슐화
    // 객체의 필드(속성), 메소드를 하나로 묶고, 실제 구현 내용을 외부에 감추는 것
    // 외부 객체는 객체 내부의 구조를 얻지 못하며 객체가 노출해서 제공하는 필드와 메소드만 이용할 수 있다.
    // 필드와 메소드를 캡슐화하여 보호하는 이유는 외부의 잘못된 사용으로 인해 객체가 손상되지 않도록 하는데 있다.
    // 자바 언어는 캡슐화된 멤버를 노출시킬 것인지 숨길 것인지를 결정하기 위해 접근 제한자(Access Modifier)를 사용한다.
    // 꼭 필요한 정보와 기능만 외부에 오픈함
    // 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현 가능
    // 외부에 통합된 인터페이스만은 제공 => 사용자 좀 더 사용하기 쉽게하기 위해
    // 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화 한다.

    // String은 불변(immutable)하기 때문에 값을 변경할 수 없다
    // String은 새로운 값을 할당할 때마다 새로 생성된다. (값 변경은 기존 String에 들어있던 값을 버리고 새로 값을 할당하는 것)
    // 문자열 추가,수정,삭제 등의 연산이 빈번하게 발생하는 알고리즘에 String 클래스를 사용하면 힙 메모리(Heap)에 많은 임시 가비지(Garbage)가 생성되어
    // 힙메모리가 부족으로 어플리케이션 성능에 치명적인 영향을 끼친다.

    // StringBuilder / StringBuffer 는 값을 memory에 append하는 방식으로 클래스를 직접생성하지 않는다.
    // StringBuffer는 공통 메소드가 동기화되므로 멀티 쓰레드 환경에서는 StringBuffer를 사용하는 것이 안전
    // 그 외에는 StringBuilder가 성능이 뛰어나기에 StringBuilder를 사용
    StringBuffer buffer = new StringBuffer();

    // 객체 설계 시 해당 속성과 메소드를 외부에 공개할지 안할지 정하는것은 중요한 작업!
    private String line = "===========================================\n";
    private String title = "  이름\t   주소 \t\t  전화번호  \n";

    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    // body 는 바뀔 수 있게 구현 가능
    private void generateBody() {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter() {

        buffer.append(line);
    }

    // report generate template
    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }

}
