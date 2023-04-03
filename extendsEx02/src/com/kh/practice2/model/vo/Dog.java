package com.kh.practice2.model.vo;

public class Dog extends Animal{
	
	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight){
		super(name,kinds);
		setWeight(weight);
	}
	
	@Override
	public void speak() {
		String str = super.toString();
		// 부모의 메서드를 호출
		System.out.println(str +"몸무게는 "+weight+"kg입니다.");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
