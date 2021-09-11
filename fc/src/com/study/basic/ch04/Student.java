package com.study.basic.ch04;

import java.util.Objects;

public class Student implements Cloneable {

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // equals() 메서드
    // 두 인스턴스의 주소 값을 비교하여 true/false를 반환
    // 재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 구현함
    // 인스턴스가 다르더라도(메모리에 물리적으로 다른 위치에 있더라도) 논리적으로 동일한 경우 true를 반환하도록 재정의 할 수 있음
    // (같은 학번, 같은 사번, 같은 아이디의 회원...)
    public boolean equals(Object obj) {
        if( obj instanceof Student) {
            Student std = (Student)obj;
            if(this.studentId == std.studentId )
                return true;
            else return false;
        }
        return false;

    }

    // hashCode() 메서드
    // hashCode()는 인스턴스의 저장 주소를 반환함
    // 힙메모리에 인스턴스가 저장되는 방식이 hash 방식
    // hash : 정보를 저장, 검색하는 자료구조
    // index(저장위치) = hash(key)
    // 자료의 특정 값(키 값)에 대한 저장 위치를 반환해주는 해시 함수를 사용(오브젝트를 메모리 어디에 저장할 지 주소,인덱스를 지정)
    // 두 인스턴스가 같다는 것은?
    // 두 인스턴스에 대한 equals()의 반환 값이 true
    // 동일한 hashCode() 값을 반환
    // 논리적으로 동일함을 위해 equals() 메서드를 재정의 하였다면 hashCode()메서드도 재정의 하여 동일한 hashCode 값이 반환되도록 한다
    @Override
    public int hashCode() {
//        return studentId;
        return Objects.hash(studentId, studentName);
    }

    // hash 값을 사용하는 Collection(HashMap, HashSet, HashTable)은 객체가 논리적으로 같은지 비교할 때
    // hashCode 메서드의 리턴 값이 우선 일치하고 equals 메서드의 리턴 값이 true여야 논리적으로 같은 객체라고 판단한다.
    // String 같은 클래스는 이미 재정의되어 있다.


    // clone() 메서드
    // 객체의 원본을 복제하는데 사용하는 메서드 (현재 인스턴스 상태를 그대로 복제)
    // 생성과정의 복잡한 과정을 반복하지 않고 복제 할 수 있음
    // clone() 메서드를 사용하면 객체의 정보(멤버 변수 값등...)가 동일한 또 다른 인스턴스가 생성되는 것이므로, 객체 지향 프로그램에서의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음
    // 해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시하자 (복제 가능하다는 표시)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
