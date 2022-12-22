package com.app.thejava;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultBookService implements BookService {

	private final BookRepository bookRepository;

	public void rent(Book book) {
		System.out.println("rent = " + book);
	}
}
