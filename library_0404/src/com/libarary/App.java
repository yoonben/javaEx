package com.libarary;

public class App {
	public static void main(String[] args) {
		
		Library lib = new Library();
		System.out.println(lib.toString());
		lib.insert(1, "오늘도", "우리는", false);
		System.out.println("오늘도 우리는 추가 테스트 ===============");
		System.out.println(lib.toString());
	}
}
