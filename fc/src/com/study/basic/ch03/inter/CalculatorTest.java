package com.study.basic.ch03.inter;

public class CalculatorTest {

    // 인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환 할 수 있음
    // Calc calc = new CompleteCalc();
    // 상속에서의 형 변환과 동일한 의미(타입상속, 다형성)
    // 하나의 인터페이스를 여러 객체가 구현하게 되면 클라이언트 프로그램은 인터페이스의 메서드를 활용하여 여러 객체의 구현을 사용할 수 있음 (다형성)
    // 즉, 인터페이스를 두고 그 구현객체(정책)가 바뀌어 사용됨 - 전략패턴
    // 클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있음 (cf. extends)
    // 형 변환되는 경우 인터페이스에 선언된 메서드만을 사용가능함

    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        int num1 = 10;
        int num2 = 2;

        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" +calc.substract(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" +calc.times(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" +calc.divide(num1, num2));

        int[] arr = {1,2,3};
        System.out.println(Calc.total(arr));
    }

}
