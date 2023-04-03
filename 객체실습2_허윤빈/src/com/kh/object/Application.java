package com.kh.object;

import java.util.Random;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		Book book0 = new Book();
		Book book1 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(book0.information());
		System.out.println(book1.information());
		System.out.println("===========================");
		
		book0.setTitle("C언어");
		book0.setPrice(30000);
		book0.setDiscounRate(0.2);
		book0.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book0.information());
		System.out.println("===========================");
		
		book0.result();
		book1.result();
	}

}
