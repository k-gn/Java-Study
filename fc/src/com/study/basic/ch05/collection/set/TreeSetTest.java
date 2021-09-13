package com.study.basic.ch05.collection.set;

// # 정렬을 위해 Comparable과 Comparator 인터페이스 구현하기
// # TreeSet
// 객체의 정렬에 사용하는 클래스
// Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있음
// 내부적으로 이진검색트리(binary search tree)로 구현됨
// 이진검색트리에 저장하기 위해 각 객체를 비교해야 함
// 비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현 해야 TreeSet에 추가 될 수 있음 (TreeSet 외에도 정렬을 필요로할때 구현해야함)
// 객체(Object)의 정렬기준을 만들어 주기 위해서 구현해야함
// String, Integer등 JDK의 많은 클래스들이 이미 Comparable을 구현했음
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for(String str : treeSet) {
            System.out.println(str);
        }
    }

}
// # Comparable
//java.lang package
//객체의 정렬기준을 정해줄 때 사용한다.
//Comparable 인터페이스의 구현체는 compareTo메서드를 구현해야 한다.

// # Comparator
//java.util package
//이미 정해진 정렬기준 외 다른 정렬기준을 사용하고 싶을때 사용한다.
//Comparator 인터페이스의 구현체는 compare메서드를 구현해야 한다.
//Comparator 인터페이스의 구현체는 그 자체가 정렬자로 사용된다. (정렬기준)