package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.servies.BookService;

@RestController
@RequestMapping("Book/")
public class Book_Author_Cont {

	@Autowired
	BookService bookService;
	
	@GetMapping("get")
	public List<Book> getBook(){
		List<Book> allBooks = bookService.getAllBooks();
		return allBooks;
	}
	
	@GetMapping("get/{id}")
	public Book getBookById (@PathVariable int id) {
		Book byId = bookService.getById(id);
		return byId;
	}
	
	@PostMapping("add")
	public Book addBooks (@RequestBody Book book) {

		try {
			Book addBook = bookService.addBook(book);
			return addBook;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	@PutMapping("put/{id}")
	public Book updateBook (@RequestBody Book book, @PathVariable int id) {
		Book book1 = bookService.updateBookById(book, id);
		return book1;
	}
	
	@DeleteMapping("delete/{id}")
	public int deleteBooks (@PathVariable int id) {
		bookService.deleteById(id);
		return 1;
	}
}
