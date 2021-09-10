package com.study.basic.ch02.basic2;

public class Subject {

    // # 접근 제어 지시자 (accesss modifier)
    // 패키지는 소스코드의 묶음
    // 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
    // private : 같은 클래스 내부에서만 접근 가능 ( 외부 클래스, 상속 관계의 클래스에서도 접근 불가)
    // 아무것도 없음 (default) : 같은 패키지 내부에서만 접근 가능 ( 상속 관계라도 패키지가 다르면 접근 불가)
    // protected : 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
    // public : 클래스의 외부 어디서나 접근 할 수 있음

    // # 정보 은닉
    // private으로 제어한 멤버 변수도 public 메서드가 제공되면 접근 가능하지만 변수가 public으로 공개되었을 때보다
    // private 일때 각 변수에 대한 제한을 public 메서드에서 제어 할 수 있다.
    // 객체 지향 프로그램에서 정보 은닉은 외부에서 접근 가능한 최소한의 정보를 오픈함으로써 객체의 오류를 방지하고 클라이언트 객체가 더 효율적으로 객체를 활용할 수 있도록 해준다.
    // 클래스에 담는 내용중 중요한 데이터나 기능을 외부에서 접근하지 못하게하기 위해 사용 (중요한 데이터를 보존,보호)
    // 메서드는 public으로 하여 직접 접근은 막고 메서드를 통한 간접 접근 허용

    // # getter, setter
    // private 으로 선언된 멤버 변수 (필드)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공
    // get() 메서드만 제공 되는 경우 read-only 필드
    // set() 메소드에서 유효성 검증 가능

    private String subjectName;
    private int score;
    private int subjectID;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }
}
