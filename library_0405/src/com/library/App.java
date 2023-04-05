package com.library;

import java.util.Scanner;

public class App {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		// 라이브러리 생성
		Library lib = new Library();
		// app을 생성하지 않고 getString(), getInt() 메서드를 사용 할 수 없다
		// main 메소드는 static메소드 정적메서드
		// 정적필드에서는 인스턴스필드를 사용할 수 없어
		// 생성하고 사용해야 합니다.
		
		// 또는 getString(), getInt() 를 정적 메소드로 만든다
		App app = new App();
		
		while(true) {
			
			// 로그인 
			// id를 입력 받아서 admin이면 관리자 아니면 사용자
			System.out.print("id : ");
			
			// 자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해집니다.
			// 스캐너로 부터 입력을 받아서 리턴해주는 역할
			String id = getString();
			if(id.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);
			}
			
			outter : while(true) {
			if(id.equalsIgnoreCase("admin")) {
				// 어드민 - 책 등록, 책 삭제
				
				System.out.println("관리자 메뉴 입니다.");
				System.out.println("1. 도서 등록 |2. 도서 삭제 |0. 로그 아웃 |q. 종료");
				int menu = getInt();
				
				switch (menu) {
				case 1:
					System.out.println("일련번호를 입력해주세요");
					int no = getInt();
					System.out.println("제목을 입력해주세요");
					String title = getString();
					System.out.println("저자를 입력해주세요");
					String author = getString();
					lib.insertBook(no, title, author, false);
					break;
				case 2:
					System.out.println("삭제할 도서의 일련번호를 입력해주세요");
					no = getInt();
					lib.deleteBook(no);
					break;
				case 0:
					System.out.println(id+"님 로그아웃 합니다.");
					break outter;
				default:
					System.out.println(menu+"없는 메뉴입니다.");
					break;
				}
				
			}else {
				// 사용자 - 책 대여, 책 반납
				System.out.println(id + "님 환영합니다.");
				System.out.println("1. 도서 대여 |2. 도서 반환 |0. 로그 아웃 |q. 종료");
				int menu = getInt();
				
				switch (menu) {
				case 1:
					System.out.println("대여할 도서의 일련번호를 입력해주세요");
					int no = getInt();
					lib.rentBook(no);
					break;
					
				case 2:
					System.out.println("반납할 도서의 일련번호를 입력해주세요");
					no = getInt();
					lib.returBook(no);
					break;
					
				case 0:
					System.out.println(id+"님 로그아웃 합니다.");
					break outter;
					
				default:
					System.out.println(menu+"없는 메뉴입니다.");
					break;
				}
			}
			}
		}
		
//		// 책 추가
//		lib.insertBook(1, "불편한편의점", "나카사키", false);
//		lib.insertBook(2, "불편한편의점2", "나카사키", false);
//		lib.insertBook(3, "오늘도", "우리는", false);
//	
//		// 책 삭제
//		int no = 3;
//		boolean res = lib.deleteBook(no);
//		
//		// 책 대여
//		no = 1;
//		res = lib.rentBook(no);
//		
//		// 책 반납
//		res = lib.returBook(no);
	}
	/**
	 * 사용자로 부터 입력받은 문자열을 반환합니다.
	 * - 숫자가 입력될 경우 다시 입력을 요청
	 * - Q,q가 입력될 경우 프로그럄 종료
	 * @return
	 */
	public static String getString() {
		
		String str = "";
		
		while(true) {
		try {
			str = scan.next();
			// Q, q 입력되었으면 프로그램 종료
			if(str.equalsIgnoreCase("q")) {
				System.exit(0);
			}
			
			// 숫자로 변환시 숫자로 변경되면 문자를 입력해달라고 다시요청
			Integer.parseInt(str);
			
			System.err.println("문자를 입력해주세요");
			
		} catch (Exception e) {
			// 문자가 입력된 경우 반복문 탈출
			break;
		}
		}
		return str;
	}
	
	/**
	 * 사용자로부터 정수를 입력받아 반환합니다.
	 * - 문자가 입력되었을 경우 다시 입력 받습니다.
	 * - Q, q 가 입력 되었을 경우 프로그램을 종료 합니다.
	 * @return
	 */
	public static int getInt() {
		int i =0;
		String str = "";
		
		while(true) {
			try {
				// 사용자 입력 받기
				str = scan.next();
				// Q인지 확인하기
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				// 숫자로 변환하기
				i = Integer.parseInt(str);
				
				break;
			} catch (Exception e) {
				// 오류가 발생시 다시 사용자 입력으로
				System.err.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}
}
