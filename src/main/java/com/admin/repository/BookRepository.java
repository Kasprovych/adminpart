package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {



}
