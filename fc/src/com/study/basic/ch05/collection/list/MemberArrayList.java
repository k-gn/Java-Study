package com.study.basic.ch05.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

// 자바에서 제공되는 자료구조 구현 클래스들 - 컬레션 프레임워크
// # 컬렉션 프레임워크
// 배열을 사용하다 보면 여러가지 비효율적인 문제가 생긴다. 가장 큰 문제점은 크기가 고정적이라는 것.
// 배열의 크기는 생성할 때 결정되며 그 크기를 넘어가게 되면 더이상 데이터를 저장할 수 없다.
// 또 데이터를 삭제하면 해당 인덱스의 데이터는 비어있어 메모리가 낭비되는 등 여러 문제점들이 발생한다.
// 그렇기에 자바는 배열의 이러한 문제점을 해결하기 위해, 자료구조를 바탕으로 객체나 데이터들을 효율적으로 관리(추가, 삭제, 검색, 저장)할 수 있는 자료구조들을 만들어 놓았다.
// 이러한 자료구조들이 있는 라이브러리를 컬렉션 프레임워크라한다.
// 프로그램 구현에 필요한 자료구조(Data Structure)를 구현해 놓은 JDK 라이브러리
// java.util 패키지에 구현되어 있음
// 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음
// 여러 구현 클래스와 인터페이스의 활용에 대한 이해가 필요함
// Java에서 컬렉션(Collection)이란 데이터의 집합, 그룹을 의미
// 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미한다.
// 즉, 데이터를 저장하는 자료구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해놓은 것.
// - 순서가 있는 목록인 List형
// - 순서가 중요하지 않은 목록인 Set형
// - 먼저 들어온 것이 먼저 나가는 Queue형
// - KEY-VALUE의 형태로 저장되는 Map형

// # Collection 인터페이스
// 하나의 객체를 관리하기 위한 메서드가 선언된 인터페이스
// 하위에 List와 Set 인터페이스가 있음

// # List 인터페이스
// 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스
// 자료구조 리스트 (배열, 연결리스트)의 구현을 위한 인터페이스
// 중복을 허용함
// ArrayList, Vector, LinkedList, Stack, Queue 등...

//# Set 인터페이스
// 순서와 관계없이 중복을 허용하지 않고 유일한 값을 관리하는데 필요한 메서드가 선언됨
// 아이디, 주민번호, 사번등을 관리하는데 유용
// 저장된 순서와 출력되는 순서는 다를 수 있음
// HashSet, TreeSet등...

// # Map 인터페이스
// 쌍(pair)로 이루어진 객체를 관리하는데 사용하는 메서드들이 선언된 인터페이스
// 객체는 key-value의 쌍으로 이루어짐
// key는 중복을 허용하지 않음
// HashTable, HashMap, Properties, TreeMap 등이 Map 인터페이스를 구현 함

// TreeSet, TreeMap은 이진 트리(binary tree)를 이용해서 계층적 구조(Tree 구조)를 가지면서 객체를 저장, 내부적으로 정렬이 된다.

public class MemberArrayList {
    // 멤버를 순차적으로 관리
    private ArrayList<Member> arrayList;  // ArrayList 선언

    public MemberArrayList(){
        arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
    }

    public void addMember(Member member){  //ArrayList 에 멤버 추가
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환

        for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면
                arrayList.remove(i);           // 해당 멤버를 삭제
                return true;                   // true 반환
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
        return false;
    }

    // # 요소의 순회란?
    // 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것
    // 순서가 있는 List인터페이스의 경우는 Iterator를 사용 하지 않고 get(i) 메서드를 활용할 수 있음
    // Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함

    // # Iterator
    // boolean hasNext() : 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환
    // E next() : 다음에 있는 요소를 반환
    public boolean removeMember2(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환

        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면
                arrayList.remove(member);           // 해당 멤버를 삭제
                return true;                   // true 반환
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
        return false;
    }


    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }

}
