package com.library;

import java.util.Scanner;

import com.library.vo.Library;

public class Application {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Application app = new Application();
		
		// 도서관 생성
		Library lib = new Library("file");
		
		// 로그인 처리
		while(true){
		System.out.println("아이디를 입력해주세요.");
		String id = app.getString();
		
		if("admin".equalsIgnoreCase(id)) {
			// 관리자
			app.adminMenu(lib);
			
		}else {
			// 도서목록 출력
			lib.info();
			// 사용자
			// 메뉴별로 작업수행
			app.memberMenu(lib);
			
		}
		}
		
	}
	
	
	private void adminMenu(Library lib) {
					// 관리자 메뉴
					// 도서 목록 출력
					lib.info();
					//메뉴확인
					while(true) {
					System.out.println("1. 도서등록 |2. 도서삭제 |3. 도서 목록 |0.로그아웃 |q. 프로그램종료");
					int menu = getInt();
					if(menu == 1) {
						// 도서 등록
						System.out.println("도서 번호를 입력해주세요.");
						int no = getInt();
						System.out.println("도서 제목을 입력해주세요.");
						String title = getString();
						System.out.println("도서 저자를 입력해주세요.");
						String author = getString();
						lib.insertBook(no, title, author, false);
					
					}else if(menu == 2) {
						// 도서 삭제
						System.out.println("도서 번호를 입력해주세요.");
						int index = getInt();
						lib.deletBook(index);
					
					}else if(menu == 3) {
						// 목록 출력
						lib.info();
					}else if(menu == 0) {
						// 로그아웃
						System.out.println("로그아웃 되었습니다.");
						return;
					}else {
						System.out.println("메뉴를 확인해주세요");
					}
					}
	}
	
	private void memberMenu(Library lib) {
		while(true) {
			System.out.println("1. 도서대여 |2. 도서반납 |3. 도서 목록 |0. 로그아웃 |q. 시스템종료");
			int menu = getInt();
			if(menu == 1) {
				System.out.println("도서 번호를 입력해주세요.");
				int index = getInt();
				lib.rentBook(index);
			}else if(menu == 2) {
				System.out.println("도서 번호를 입력해주세요.");
				int index = getInt();
				lib.returnBooK(index);
			}else if(menu == 3) {
				lib.info();
			}else if(menu == 0) {
				System.out.println("로그아웃 되었습니다.");
				break;
			}else {
				System.out.println("메뉴를 확인해주세요");
			}
		}
	}
	/**
	 * 사용자로부터 숫자를 입력 받습니다.
	 * @return
	 */
	public int getInt() {
		int i = 0;
		while(true) {
		try {
			String str = scan.next();
			
			if(str.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			
			i = Integer.parseInt(str);
			break;
		} catch (Exception e) {
			System.out.println("입력중 오류가 발생했습니다.");
			System.out.println("숫자를 입력해주세요.");
		}
		}
		return i;
	}
	
	/**
	 * 사용자로부터 문자를 입력 받습니다.
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {
			
		try {
			res = scan.next();
			try {
				Integer.parseInt(res);
				System.err.println("문자를 입력해주세요.");
				continue;
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(res.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			break;
		} catch (Exception e) {
			System.out.println("입력중 오류가 발생 했습니다.");
			System.out.println("문자를 입력해주세요.");
		}
		}
		return res;
	}
}
