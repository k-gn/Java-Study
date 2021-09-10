package com.study.basic.ch02.basic3;

public class Employee {

    // # static
    // 여러 인스턴스가 공유하는 기준 값이 필요한 경우
    // 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 클래스 로딩이 일어나면서 메모리를 할당 (데이터 영역에 할당)
    // 클래스 멤버, 정적 멤버라고도 함(vs. 인스턴스 멤버)
    // 인스턴스 생성과 상관 없이 이미 메모리에 있어서 클래스 이름으로 직접 참조하여 사용 가능
    // 인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
    // 보통 스태틱 메소드는 유틸리티 클래스의 메소드를 작성할 때 많이 사용 (유틸리티 클래스는 상태를 가지고 있지 않는 클래스라고 보면 된다.)
    // 또한 인스턴스 멤버가 쓰이지 않는 메소드에 static 붙일 것을 고려해보자
    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

    // 변수의 유효 범위(scope)와 생성과 소멸(life cycle)은 각 변수의 종류마다 다름
    // 지역변수, 멤버 변수, 클래스 변수는 유효범위와 life cycle, 사용하는 메모리도 다름
    // 지역변수는 함수 내부에서 사용되며 함수가 끝나면 소멸
    // 멤버변수는 클래스 내부에서 사용되며 해당 인스턴스 소멸 시 같이 소멸
    // 클래스변수는 클래스 내부에서 사용되며 프로그램 종료 시 소멸

    // static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
    // 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음
    // 멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리가 할당됨 => 상황에 적절하게 변수를 사용해야 함

}
