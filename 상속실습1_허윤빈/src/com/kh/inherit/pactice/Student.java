package com.kh.inherit.pactice;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student() {

	}
	
	// 초기화 : 생성자의 매개변수를 필드에 입력합니다.
	public Student(String name, int age, double height, 
			double weight, int grade, String major) {
		super(age,height,weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String information(){
		String information = super.infomation();
		return information+" "+getGrade()+" "+getMajor();
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
