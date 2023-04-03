package com.library.vo;

public class Book {
	// 일렬번호
	private int no;
	//제목
	private String title;
	//작가
	private String author;
	//대여여부(true:대여중, false: 대여가능)
	private boolean isRent;
	
	public Book(int no, String title, String author, boolean isRent) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	// 책의 정보를 출력합니다
	public void info() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}
		System.out.println(getNo()
						+ " | " + getTitle()
						+ " | " + getAuthor()
						+ " | " + str);
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
}
