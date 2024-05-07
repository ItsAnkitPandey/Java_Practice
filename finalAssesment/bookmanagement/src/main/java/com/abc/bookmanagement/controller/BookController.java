package com.abc.bookmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.bookmanagement.entity.Book;
import com.abc.bookmanagement.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

 // Get a single book by ID
    @GetMapping("/{id}")
	public ResponseEntity<Book> fetchBookDetails(@PathVariable("id") int bookId){
		Optional<Book> optionalBook = bookRepository.findById(bookId);
		Book book = optionalBook.get();
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

    // Update a book
    @PutMapping("/update")
	public ResponseEntity<Book> editBook(@RequestBody Book book) {
    	Optional<Book> optionalBook = bookRepository.findById(book.getId());
    	bookRepository.save(book);
		ResponseEntity<Book> responseEntity = new ResponseEntity<>(book, HttpStatus.OK);
		return responseEntity;
	}

    // Delete a book
    @DeleteMapping("/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") int bookId) {
		String msg = "Deleted Seccessfully";
		Optional<Book> optionalBook = bookRepository.findById(bookId);
		Book book = optionalBook.get();
		bookRepository.delete(book);
		ResponseEntity<String> responseEntity = new ResponseEntity<>(msg, HttpStatus.OK);
		return responseEntity;
	}
}
