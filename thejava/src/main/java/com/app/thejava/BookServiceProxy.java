package com.app.thejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
	# 프록시 패턴
	프록시와 리얼 서브젝트가 공유하는 인터페이스가 있고, 클라이언트는 해당 인터페이스 타입으로 프록시를 사용한다.
	클라이언트는 프록시를 거쳐서 리얼 서브젝트를 사용하기 때문에 프록시는 리얼 서브젝트에 대한 접근을 관리거나 부가기능을 제공하거나, 리턴값을 변경할 수도 있다.
	리얼 서브젝트는 자신이 해야 할 일만 하면서(SRP) 프록시를 사용해서 부가적인 기능(접근 제한, 로깅, 트랜잭션, 등)을 제공할 때 이런 패턴을 주로 사용한다.

	# 자바의 다이나믹 프록시
	런타임에 특정 인터페이스들을 구현하는 클래스 또는 인스턴스를 만드는 기술
	인터페이스로만 생성 가능
		● Object Proxy.newProxyInstance(ClassLoader, Interfaces, InvocationHandler)
		● 유연한 구조가 아니다. 그래서 스프링 AOP 등장!

	클래스의 프록시가 필요하다면?
	# CGlib
	스프링, 하이버네이트가 사용하는 라이브러리
	버전 호환성이 좋치 않아서 서로 다른 라이브러리 내부에 내장된 형태로 제공되기도 한다.
	상속을 사용하지 못하는 경우 프록시를 만들 수 없다.
		○ Private 생성자만 있는 경우
		○ Final 클래스인 경우

	인터페이스가 있을 때는 인터페이스의 프록시를 만들어 사용할 것.

	다이나믹 프록시
	● 런타임에 인터페이스 또는 클래스의 프록시 인스턴스 또는 클래스를 만들어 사용하는 프로그래밍 기법

	다이나믹 프록시 사용처
	● 스프링 데이터 JPA
	● 스프링 AOP
	● Mockito
	● 하이버네이트 lazy initialzation
	● ...
 */
@Service
public class BookServiceProxy implements BookService {

	@Qualifier("defaultBookService")
	@Autowired
	BookService bookService;

	@Override
	public void rent(Book book) {
		System.out.println("log start");
		bookService.rent(book);
		System.out.println("log end");
	}
}
