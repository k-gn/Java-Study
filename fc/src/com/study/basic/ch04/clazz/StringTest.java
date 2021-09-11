package com.study.basic.ch04.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// # Class 클래스
// 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
// 클래스당 하나만 존재
// Java는 동적 로딩을 지원하기 때문에 실행 시에 모든 클래스가 로딩되지 않고 필요한 시점에 클래스를 로딩하여 사용할 수 있다.
// 동적이라는 의미는 런타임 시점을 의미하고, 정적이라는 의미는 컴파일 시점을 의미
// Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 클래스 정보를 가져오는 메서드가 제공됨
// 즉, 클래스 파일은 항상 메모리에 로드되어 있는 것이 아니라 클래스로더의 내부적인 구조와 위임 정책에 의해 동적으로 로딩
public class StringTest {

    public static void main(String[] args) throws ClassNotFoundException {

        // 클래스 이름으로 직접 Class 클래스 가져오기
        Class c = String.class;
//        String name = c.newInstance();

        // 생성된 인스턴스에서 Class 클래스 가져오기
        String s = new String();
        Class c2 = s.getClass();  //Object 메서드

        // # 동적 로딩
        // 컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime) 중에 데이터 타입을 binding 하는 방법
        // 프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에 원하는 클래스를 로딩하여 binding 할 수 있다는 장점
        // 필요한 기능만 메모리에 불러와 사용하기 때문에, 큰 프로그램도 작은 메모리에서 실행이 가능하다. (실행에 필요한 정보만을 메모리에 로드할 수 있다.)
        // 컴파일 타임에 모든 클래스의 정보를 알 필요가 없다.
        // 동적 로딩을 통해 외부 플러그인 확장 및 사용에 용이
        // 일부 클래스가 변경되어도 전체 어플리케이션을 다시 컴파일 하지 않아도 된다.
        // 변경사항이 발생해도 비교적 적은 작업만으로도 처리할 수 있는 유연한 어플리케이션을 작성할 수 있다
        // 컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램의 심각한 장애가 발생가능 + 속도 측면에서 불리

        // # 클래스 정보 알아보기
        // reflection 프로그래밍 : Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드)등을 알 수 있고 인스턴스를 생성하고,
        // 메서드를 호출하는 방식의 프로그래밍 (실행 시간에 다른 클래스를 동적으로 로딩하여 접근)
        // 동적으로 특정 클래스의 정보를 추출해낼 수 있는 프로그래밍 기법 (자바 '클래스'의 정보를 가져와서 활용)
        // 구체적인 클래스 타입을 알지 못해도, 그 클래스의 메소드, 타입, 변수등 클래스 정보에 접근할 수 있도록 해주는 자바 API
        // 로컬 메모리에 객체가 없는 경우, 원격 프로그래밍, 객체의 타입, 내용을 알 수 없는 경우에 사용
        // 코드를 작성할 시점에는 어떤 타입의 클래스를 사용할지 모르지만, 런타임 시점에 지금 실행되고 있는 클래스를 가져와서 실행해야 하는 경우 사용
        // 동적으로 클래스를 사용해야 할때 필요 (즉, 작성 시점에는 어떤 클래스를 사용해야 할지 모르는 경우, 런타임 시점에서 클래스를 가져와서 실행해야 하는 경우에 사용)
        // IntelliJ의 자동완성이나 Spring 프레임워크의 어노테이션 같은 기능들이 리플렉션을 이용해서 프로그램 실행 중 동적으로 클래스 정보를 가져와서 사용하는 예이다.
        // 스프링 di, aop, proxy, 디스패쳐 서블릿 등 생각해보면 다양한 곳에서 활용하고 있다.
        // java.lang.reflect 패키지에 있는 클래스를 활용하여 프로그래밍
        // 일반적으로 자료형을 알고 있는 경우엔 사용하지 않음

        // Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드
        Class c3 =  Class.forName("java.lang.String"); // 로딩하고자 하는 클래스 명으로 클래스를 찾아 동적 로드

        Constructor<String>[] cons =  c3.getConstructors();
        for(Constructor con: cons) {
            System.out.println(con);
        }

        System.out.println();

        Method[] methods = c3.getMethods();
        for(Method  method : methods) {
            System.out.println(method);
        }

        // Class의 newInstance()메서드로 인스턴스 생성
        // new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스를 생성할 수 있음
    }

}
