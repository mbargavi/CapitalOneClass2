package com.capital.one.service;

import java.util.List;

import javax.jws.WebService;

import com.capital.one.model.Book;

@WebService
public interface Library {
		List<Book> getAll();
}
