package com.app.thejava.reflection;

import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.app.thejava.Book;
import com.app.thejava.MyBook;

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
	}
}
