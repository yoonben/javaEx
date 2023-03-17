package com.junang;

public class OperatorEx {
	public static void main(String[] args) {
		
		int x=5, y=4;
		// 증감연산자 (++/--) : 1증가, 1감소
		// 증감연산자의 위치에 따라 값이 결정
		System.out.println("x = "+ x);
		System.out.println(++x);
		System.out.println("x = "+ x);
		System.out.println(x++);
		System.out.println("x = "+ x);
		System.out.println("=============================");
		System.out.println("y = "+ y);
		System.out.println(--y);
		System.out.println("y = "+ y);
		System.out.println(y--);
		System.out.println("y = "+ y);
		System.out.println("=============================");
		
		x= 10;
		y= 10;
		
		
		int result = ++x + 10;//21
		int result2 = y ++ +10;//20
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println("=============================");
		
		// 부정 연산자
		if(!true) {
			
		}
		// 비교 연산자
		// 두 값이 같은지 비교 ==
		if(x==y) {
			System.out.println("1==1");
		}
		// 두 값이 다른지 비교 !=
		if(!(x!=y)) {
			System.out.println("1!=");
		}
		
		
		
		
		// 나머지 연산자 % 
		// 두 수의 나눗셈 결과 나머지 값을 반환
		// -> 홀수 인지 짝수 인지 구분할때
		if(x%y == 0) {
			System.out.println(x%y);
			System.out.println("짝수");
		}else {
			System.out.println(x%y);
			System.out.println("홀수");
		}
		
		boolean b = (x+y) <5;
		System.out.println("비교 연산의 결과 "+b);
	}
}
