package com.app.thejava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DefaultBookServiceTest {

	@Autowired
	BookServiceProxy bookServiceProxy;

	@Test
	void di() {
		assertNotNull(bookServiceProxy);
	}

	@Test
	void rent() {
		Book book = new Book();
		bookServiceProxy.rent(book);
	}
}