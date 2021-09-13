package com.study.basic.ch06.lambda;

// 함수형 인터페이스
// 추상 메서드가 오직 하나인 인터페이스
// 자바 컴파일러는 이렇게 명시된 함수형 인터페이스에 두 개 이상의 메소드가 선언되면 오류를 발생시킨다.
// default method 또는 static method 는 여러 개 존재해도 상관 없다
// 람다식을 선언하기 위한 인터페이스
// 익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언해야함 (이름이 없기 때문에 어떤 메소드를 구현했는지 모호해진다.)
// @FunctionalInterface 애노테이션(annotation) : 함수형 인터페이스라는 의미, 내부에 여러 개의 메서드를 선언하면 컴파일 에러남
@FunctionalInterface // 해당 인터페이스가 함수형 인터페이스 조건에 맞는지 검사하는 어노테이션
public interface Add {

    public int add(Integer x, int y); // Integer -> int , int -> Integer 이런 클래스들은 오토박싱이 동작한다.
}

// Java 에서 기본적으로 제공하는 Functional Interfaces

/*
    함수형 인터페이스	    Descripter	            Method
    Predicate	        T -> boolean	        boolean test(T t)           - 인자 하나를 받아서 boolean 타입을 리턴.
    Consumer	        T -> void	            void accept(T t)            - 인자 하나를 받고 아무것도 리턴하지 않음. ( (인자) 를 받아서 소비만 하고 끝낸다고 생각 )
    Supplier	        () -> T	                T get()                     - 아무런 인자를 받지 않고 T 타입의 객체를 리턴
    Function<T, R>  	T -> R	                R apply(T t)                - T 타입 인자를 받아서 R 타입을 리턴
    Comparator	        (T, T) -> int	        int compare(T o1, T o2)     - T 타입 인자 두개를 받아서 int 타입을 리턴
    Runnable	        () -> void	            void run()                  - 아무런 객체를 받지 않고 리턴도 하지 않음. (이름 그대로 실행만 할 수 있다고 생각)
    Callable	        () -> T	                V call()                    - 아무런 인자를 받지 않고 T 타입 객체를 리턴 (Runnable 과 함께 병렬 처리를 위해 등장했던 개념)

    # 두개의 인자를 받는 함수형 인터페이스
    함수형 인터페이스	    Descripter	        Method
    BiPredicate	        (T, U) -> boolean	boolean test(T t, U u)
    BiConsumer	        (T, U) -> void	    void accept(T t, U u)
    BiFunction	        (T, U) -> R	        R apply(T t, U u)
*/

