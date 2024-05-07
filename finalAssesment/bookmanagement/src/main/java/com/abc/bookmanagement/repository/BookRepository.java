
package com.abc.bookmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.bookmanagement.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
}