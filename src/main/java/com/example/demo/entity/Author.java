package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Author")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String fname;
	private String lname;
	private String lang;
	
	@OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Book book;
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", fname=" + fname + ", lname=" + lname + ", lang=" + lang + "]";
	}
	public Author(int aid, String fname, String lname, String lang) {
		super();
		this.aid = aid;
		this.fname = fname;
		this.lname = lname;
		this.lang = lang;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
