package com.libary;

import java.util.ArrayList;
import java.util.List;

public class Libary_bk {
	
	List<Book> bookList = new ArrayList<>();
	
	public Libary_bk() {
		
	}
	public Libary_bk(List<Book> bookList) {
		this.bookList =bookList;
	}
	
	/**
	 * 책추가
	 * @param title
	 * @param author
	 * 
	 */
	public void addBook(String title, String author) {
		
		Book book = new Book(title,author);
		bookList.add(null);
		
	}
	
	public String toString() {
		for(Book book : bookList) {
			System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.isRent());
		}
		return super.toString();
	}
}
