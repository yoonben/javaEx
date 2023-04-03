package com.kh.practice2.model.vo;

public class Cat extends Animal{
	private String location;
	private String color;
	
	public Cat() {
		
	}
	public Cat(String name,String kinds
			, String location,String color ) {
		super(name,kinds);
		setColor(color);
		setLocation(location);
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString()+location+"에 서식하며, 색상은"
											+color+"입니다.");
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
