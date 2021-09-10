package com.study.basic.ch02.basic2;

public class Student {
    int studentID;
    String studentName;

    // 학생이 수강한 과목들에 대한 성적을 산출하기 위한 경우 학생 클래스 속성에 과목관련 속성이 모두 있으면 불합리
    // 학생(Student)과 과목(Subject)에 대한 클래스를 분리하여 사용하고 Subject 클래스를 활용하여 수강한 과목들의 변수의 타입으로 선언
    Subject korea;
    Subject math;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }


    public void setKoreaSubject(String name, int score) {
//        korea.subjectName = name;
//        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
//        math.subjectName = name;
//        math.score = score;
    }

    public void showStudentSocre() {
//        int total = korea.score + math.score;
//        System.out.println(studentName +  " 학생의 총점은 " + total + "점 입니다." );

    }

}
