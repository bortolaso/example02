package eu.example.service;

import java.util.ArrayList;
import java.util.List;

import eu.example.dao.Book;

public class BookManager {
	
	public BookManager() {}

	public List<Book> getBooks() throws Exception {

		List<Book> list = new ArrayList<Book>();
		list.add(new Book("test1"));
		list.add(new Book("test2"));
		list.add(new Book("test3"));

		return list;

	}


}