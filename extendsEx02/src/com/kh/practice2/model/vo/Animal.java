package com.kh.practice2.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		this.name =name;
		this.kinds = kinds;
	}
	
	//문자열 반환
	public String toString() {
		return "저의 이름은 "+name+"이고, 종류는 "+kinds+"인니다.";
	}
	
	
	public abstract void speak();
}
