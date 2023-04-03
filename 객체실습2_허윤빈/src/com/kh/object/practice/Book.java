package com.kh.object.practice;

public class Book {
	//필드
	private String title;
	private int price;
	private double discounRate;
	private String author;
	
	//생성자
	public Book() {
		
	}

	public Book(String title, int price, double discounRate, String author) {
		this.title = title;
		this.price = price;
		this.discounRate = discounRate;
		this.author = author;
	}
	
	//메서드
	public String information() {
		return getTitle()+"  "+getPrice()+"  "+getDiscounRate()+"  "+getAuthor();
		
	}
	
	public void result() {
		int res = (int)(getPrice()-getPrice()*getDiscounRate());
		System.out.println("도서명 = "+getTitle());
		System.out.println("할인된 가격 = "+res+"원");
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscounRate() {
		return discounRate;
	}

	public void setDiscounRate(double discounRate) {
		this.discounRate = discounRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
