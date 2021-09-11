package com.study.basic.ch03.inherit;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        // 하위 클래스를 생성하면 상위 클래스가 먼저 생성 됨
        // 메모리로 봐도 상위 클래스가 먼저 메모리에 생성되고, 이 후 하위 클래스가 생성된다.
        // private 도 생성은 되지만 하위 클래스에서 접근이 불가능할 뿐
        // new VIPCustomer()를 호출하면 Customer()가 먼저 호출 됨
        // 클래스가 상속 받은 경우 하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출 함 (super())
        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

//        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());
//
//        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//        customerKim.bonusPoint = 10000;
//        System.out.println(customerKim.showCustomerInfo());

        // 형 변환(업캐스팅)
        // 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성
        // 상위 클래스 타입의 변수에 하위 클래스 변수가 대입 가능 (매개변수)
        // 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능함
        // 상속 관계에서 모든 하위 클래스는 상위 클래스로 형 변환(업캐스팅)이 되고, 다시 하위타입으로도 변경 가능 (실제 new 되는 객체가 중요)
        // 자식 타입의 부모 객체로 선언은 불가능

        // Customer vc = new VIPCustomer(); 에서 vc가 가리키는 것은?
        // VIPCustomer() 생성자에 의해 VIPCustomer 클래스의 모든 멤버 변수에 대한 메모리는 생성되었지만,
        // 변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드임 (바인딩 되는 타입이 중요)
//        Customer customerLee2 = new VIPCustomer();


    }


}
