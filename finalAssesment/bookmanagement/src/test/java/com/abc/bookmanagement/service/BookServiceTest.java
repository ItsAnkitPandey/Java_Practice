package com.abc.bookmanagement.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.abc.bookmanagement.controller.BookController;
import com.abc.bookmanagement.entity.Book;
import com.abc.bookmanagement.repository.BookRepository;

@SpringBootTest
public class BookServiceTest {
	
		@InjectMocks
	    private BookController bookController;
	    
	    @Mock
	    private BookRepository bookRepository;

	
	    @Test
	    public void testGetAllBooks() {
	    	Book book1 = new Book();
	    	book1.setId(111);
	    	book1.setAuthor("ankit");
	    	book1.setTitle("duck");
	    	book1.setPrice(1233);
	    	
	    	
	    	Book book2 = new Book();
	    	book2.setId(112);
	    	book2.setAuthor("ankit pandey");
	    	book2.setTitle("indians");
	    	book2.setPrice(132);
	    	
	    	Book book3 = new Book();
	    	book3.setId(113);
	    	book3.setAuthor("adarsh");
	    	book3.setTitle("leadership");
	    	book3.setPrice(2342);
	    	
	    	List<Book> books = bookController.getAllBooks();
	    	books.add(book1);
	    	books.add(book2);
	    	books.add(book3);
					
			when(bookRepository.findAll()).thenReturn(books);
			
			List<Book> productList = bookController.getAllBooks();		
			assertEquals(3,productList.size());
	    }

	    @Test
	    public void testCreateBook() {
	    	Book book = new Book();
	    	book.setId(111);
	    	book.setAuthor("ankit");
	    	book.setTitle("duck");
	    	book.setPrice(1233);

	        when(bookRepository.save(book)).thenReturn(book);

	        Book result = bookController.createBook(book);

	        assertEquals(book, result);
	    }

	    @Test
	    public void testFetchBookDetails() {
	    	Book book = new Book();
	    	book.setId(111);
	    	book.setAuthor("ankit");
	    	book.setTitle("duck");
	    	book.setPrice(1233);

	    	when(bookRepository.findById(111)).thenReturn(Optional.of(book));
			
	    	 ResponseEntity<String> responseEntity = bookController.deleteBook(111);
			
			assertEquals("Deleted Successfully",responseEntity);
	    }

	    @Test
	    public void testEditBook() {
	    	Book book = new Book();
	    	book.setId(111);
	    	book.setAuthor("ankit");
	    	book.setTitle("duck");
	    	book.setPrice(1233);

	        when(bookRepository.findById(111)).thenReturn(Optional.of(book));
	        when(bookRepository.save(book)).thenReturn(book);

	        ResponseEntity<Book> responseEntity = bookController.editBook(book);

	        assertEquals(book, responseEntity.getBody());
	        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	    }

	    @Test
	    public void testDeleteBook() {
	    	Book book = new Book();
	    	book.setId(111);
	    	book.setAuthor("ankit");
	    	book.setTitle("duck");
	    	book.setPrice(1233);

	    	when(bookRepository.findById(111)).thenReturn(Optional.of(book));
			
			doNothing().when(bookRepository).delete(book);
			
			bookController.deleteBook(111);
			
			verify(bookRepository,times(1)).findById(111);
			verify(bookRepository,times(1)).delete(book);
	    }
	
	}
