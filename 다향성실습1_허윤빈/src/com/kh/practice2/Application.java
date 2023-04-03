package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {
	public static void main(String[] args) {
		// 이름 종류 서식지 색상
		Cat cat =new Cat("뼈치킨","먼치킨","미국","파랑");
		// 이름 종류 몸무게
		Dog dog = new Dog("흰둥이","잡종",15);
		
		
		Animal[] animal = new Animal[5]; 
		
		for(int i=0; i<animal.length; i++) {
			
			int j = (int) (Math.random()*2+1);
			if(j == 1) {
				animal[i] = cat;
			}else if(j == 2) {
				animal[i] = dog;
			}
		}
		
		for(Animal i : animal) {
			i.speak();

		}
	}
}
