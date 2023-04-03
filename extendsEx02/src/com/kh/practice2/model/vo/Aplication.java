package com.kh.practice2.model.vo;

public class Aplication {
	public static void main(String[] args) {
		// Animal[] 타입의 객체배열 크기 5로 생서
		Animal[] animal = new Animal[5];
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		Dog dog = new Dog("멍뭉이","말라뮤트",25);
		Cat cat = new Cat("야옹이", "먼치킨", "미국", "검정");
		
		// 0~4
		// 배열의 각 방에 고양이 또는 멍멍이를 입력
		for(int i = 0; i<animal.length; i++) {
			// 0,1
			int index= (int)(Math.random()*2);
			
			if(index == 0) {
				animal[i] = dog;
			}else {
				animal[i] = cat;
			}
		}
		// 박복문을 통해서 해당 배열의 0번의 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		for(Animal i : animal) {
			// 자식 객체에서 재정의(오버라이딩) 되어진 메서드가 호풀
			i.speak();
		}
 	}
}
