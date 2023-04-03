package com.kh.inherit;

import com.kh.inherit.practice.Student;

public class Application {
	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] =new Student("홍길동",20,178.2,70,1,"정보시스템학과");
		student[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
	
	}
}
