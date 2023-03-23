package com.jungang.common;

public class PersonMain {

	public static void main(String[] args) {
		Person per = new Person();
		Person hong = new Person( "홍길동",20, 17.5, 10.7);

		
		System.out.println(per.information());
		System.out.println(hong.information());
		
		Person[] personArr = new Person[5];
		personArr[0] = new Person("김지민", 30, 0 ,0);
		personArr[1] = new Person("한가인", 20, 0 ,0);
		personArr[2] = new Person("김종민", 15, 0 ,0);
		personArr[3] = new Person("김종국", 70, 0 ,0);
		personArr[4] = new Person("서태지", 40, 0 ,0);
		
		for(Person person: personArr) {
			System.out.println("================");
			System.out.println("이름	: "+person.name);
			System.out.println("나이	: "+person.age);
			System.out.println("키	: "+person.height);
			System.out.println("몸무게	: "+person.weight);
		}
		
		
	}

}
