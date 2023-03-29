package com.example.demo.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepo;

@Component
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;

	public List<Book> getAllBooks(){
		List<Book> findAll = bookRepo.findAll();
		return findAll;
	}
	
	public Book getById(int id) {
		Book findById = bookRepo.findById(id);
		return findById;
	}
	
	public Book addBook(Book book) {
		Book save = bookRepo.save(book);
		return save;
	}
	
	public void deleteById (int id) {
		bookRepo.deleteById(id);
	}
	
	public Book updateBookById(Book book, int id) {
		book.setId(id);
		Book save = bookRepo.save(book);
		return save;
	}
//	{
//	    "id":1,
//	    "name":"kalpesh",
//	    "title":"Moon",
//	    "author":{
//	    "aid":111,
//	    "fname":"sagar",
//	    "lname":"deshmukh",
//	    "lang":"Hindi"  
//	    }
//	}
	
}
