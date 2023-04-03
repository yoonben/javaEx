package com.libary;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Libary lib = new Libary();
		Scanner scan = new Scanner(System.in);
		
		
		// 1.책 추가
		lib.addBook("책1", "지은이1");
		lib.addBook("책2", "지은이2");
		lib.addBook("책3", "지은이3");
		
		//3.책 정보 출력
		lib.toString();
		
		System.out.println("삭제할 책번호를 선택해주세요");
		int i = 0;
		
		//2.책 삭제
		lib.removeBook(1);
		
		//3.책 정보 출력
		lib.toString();
		
		//4.책대여 : book.isRent = true;
		System.out.println("대여할 책 번호를 선택 해주세요.");
		i = 0;
		lib.updateBook(i);
		
		//3. 책 정보 출력
		lib.toString();
		// 검증 : 책 목록의 사이즈보다 큰 값이 입력되었을때 다시 입력 받을 수 있도록
	}

}
