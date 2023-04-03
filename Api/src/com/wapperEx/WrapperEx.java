package com.wapperEx;

public class WrapperEx {

	public static void main(String[] args) {
		// 박싱 
		// 기본타입 -> 참조타입
		// 자동형변환
		Integer obj1 = new Integer(100);
		Integer obj3 = new Integer("300");
		
		Integer obj2 = 100;
		Integer obj4 = Integer.valueOf("300");
		System.out.println("Integer : 박싱");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		// 언박싱 
		// 참조 타입-> 기본타입 
		// 강제형변환
		int int1 = obj1.intValue();
		int int2 = (int)obj1;
		
		// 연산시에는 자동 형변환
		int int3 = obj4 + 100; // 자동 언박싱
		System.out.println("int : 언박싱");
		System.out.println(int1);
		System.out.println(int2);
	}

}
