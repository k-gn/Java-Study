package com.app.thejava.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.thejava.Book;
import com.app.thejava.Car;
import com.app.thejava.MyAnnotation;
import com.app.thejava.MyBook;
/*
	# 리플렉션

	리플렉션 사용시 주의할 것
		● 지나친 사용은 성능 이슈를 야기할 수 있다. 반드시 필요한 경우에만 사용할 것
		● 컴파일 타임에 확인되지 않고 런타임 시에만 발생하는 문제를 만들 가능성이 있다.
		● 접근 지시자를 무시할 수 있다.

	스프링
		● 의존성 주입
		● 뷰에서 넘어온 데이터를 객체에 바인딩할 때
	하이버네이트
		● @Entity 클래스에 Setter가 없다면 리플렉션을 사용한다.
	JUnit
		● https://junit.org/junit5/docs/5.0.3/api/org/junit/platform/commons/util/ReflectionUtils.html
 */

public class ReflectionTest {

	@Test
	void create() throws ClassNotFoundException {

		Class<Book> bookClass = Book.class;

		Book book = new Book();
		Class<? extends Book> aClass = book.getClass();

		Class<?> aClass1 = Class.forName("com.app.thejava.Book");
	}

	@Test
	void field() {
		Class<Book> bookClass = Book.class;

		Arrays.stream(bookClass.getFields()).forEach(System.out::println); // return public member
		Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println); // return all member

		Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
			System.out.println("f.getName() = " + f.getName());
		});

		Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
			System.out.println("f.getType() = " + f.getType());
		});

		Book book = new Book();
		Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
			try {
				f.setAccessible(true); // private access
				System.out.println("f.get() = " + f.get(book));
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		});

		Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
			int modifiers = f.getModifiers();
			System.out.println("modifiers = " + modifiers);
			System.out.println(Modifier.isPrivate(modifiers));
			System.out.println(Modifier.isStatic(modifiers));
		});
	}

	@Test
	void method() {
		Class<Book> bookClass = Book.class;
		Arrays.stream(bookClass.getMethods()).forEach(System.out::println);

		Arrays.stream(bookClass.getMethods()).forEach(m -> {
			System.out.println("m.getName() = " + m.getName());
			System.out.println("m.getReturnType() = " + m.getReturnType());
		});
	}

	@Test
	void superClass() {
		Class<MyBook> myBookClass = MyBook.class;
		System.out.println("myBookClass.getSuperclass() = " + myBookClass.getSuperclass());
		Arrays.stream(myBookClass.getInterfaces()).forEach(System.out::println);
	}

	@Test
	void annotation() {
		Class<Book> bookClass = Book.class;
		Arrays.stream(bookClass.getAnnotations()).forEach(System.out::println);

		Arrays.stream(bookClass.getAnnotations()).forEach(a -> {
			if (a instanceof MyAnnotation) {
				MyAnnotation myAnnotation = (MyAnnotation)a;
				System.out.println("myAnnotation.value() = " + myAnnotation.value());
			}
		});
	}

	@Test
	void update() throws
		NoSuchMethodException,
		InvocationTargetException,
		InstantiationException,
		IllegalAccessException,
		NoSuchFieldException {
		Class<Car> carClass = Car.class;

		Constructor<Car> constructor = carClass.getConstructor(null);
		Car car = constructor.newInstance();
		System.out.println("car = " + car);

		Field a = carClass.getDeclaredField("A");
		System.out.println(a.get(null));
		a.set(null, "AAAAA");
		System.out.println(a.get(null));

		Field b = carClass.getDeclaredField("B");
		b.setAccessible(true);
		System.out.println(b.get(car));
		b.set(car, "BBBB");
		System.out.println(b.get(car));
	}

	@Test
	void methodRun() throws
		NoSuchMethodException,
		InvocationTargetException,
		InstantiationException,
		IllegalAccessException {
		Class<Car> carClass = Car.class;
		Constructor<Car> constructor = carClass.getConstructor(null);
		Car car = constructor.newInstance();

		Method c = carClass.getDeclaredMethod("c");
		c.invoke(car);

		Method d = carClass.getDeclaredMethod("d", int.class, int.class);
		Object invoke = d.invoke(car, 1, 2);
		System.out.println("invoke = " + invoke);
	}
}
