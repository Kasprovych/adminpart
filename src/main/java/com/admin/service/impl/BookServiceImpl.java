package com.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.domain.Book;
import com.admin.repository.BookRepository;
import com.admin.service.BookService;
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repository; 
	
	@Override
	public Book save(Book book) {
		return repository.save(book);
	}

	@Override
	public List<Book> findAll() {
		return (List<Book>)repository.findAll();
	}

	@Override
	public Book findOne(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		repository.delete(id);;
	}

}
