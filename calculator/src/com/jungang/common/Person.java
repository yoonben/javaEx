package com.jungang.common;


public class Person {
	
	protected String  name;
	public int age;
	public double height;
	public double weight;
	
	// 기본생성자 : 초기화 담당
	// 클래스 명과 같은 이름, 반환 타입이 없다
	public Person() {
		this("정우성",30,170,60);
	}
	
	public Person(String name ,int age ,double height, double weight) {
		//초기화
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//접근제한자 변환타입 메서드명(매개변수타입 매개변수명)
	/**
	 * 이름과 나이를 반환
	 * @return 이름, 나이
	 */
	public String information() {
		return name + ","+ age;
	}
}
