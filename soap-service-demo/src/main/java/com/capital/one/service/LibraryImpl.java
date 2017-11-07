package com.capital.one.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.capital.one.model.Book;

@WebService(endpointInterface="com.capital.one.service.Library")
public class LibraryImpl implements Library {

	@Override
	public List<Book> getAll() {
		//Mock DAO call
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Moby Dick", "Herman Melville", 1851));
		bookList.add(new Book("Harry Potter", "JK Rowling", 2000));
		return bookList;
	}

}
