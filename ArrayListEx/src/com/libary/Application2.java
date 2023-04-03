package com.libary;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		Libary lib = new Libary();
		Scanner scan = new Scanner(System.in);
		outer:while(true) {
			System.out.println("==================================================================");
			System.out.println("1.책 추가 |2.책 삭제 |3. 책 정보 수정 |4.책 정보 출력 |5.책 대여 | 6. 종료 ");
			System.out.println("==================================================================");
			int key = scan.nextInt();
			
			switch (key) {
			case 1:
				System.out.print("추가할 책의 제목을 입력하세요 : ");
				String a = scan.next(); 
				System.out.print("추가할 책의 저자를 입력하세요 : ");
				String b = scan.next(); 
				lib.addBook(a, b);
				break;
			case 2:
				System.out.println("삭제할 책의 번호를 입력하세요 : ");
				int c = scan.nextInt();
				lib.removeBook(c);
				break;
			case 3:
				
				break;
			case 4:
				lib.toString();
				break;
			case 5:
				System.out.println("대여할 책 번호를 선택 해주세요 : ");
				int i = scan.nextInt();
				lib.updateBook(i);
				break;
			case 6:
				break outer;
			}
		}

	}

}
