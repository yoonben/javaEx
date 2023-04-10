package com.library.controller;

import java.util.Scanner;

import com.library.service.BookSerVice;
import com.library.service.MemberSevice;
import com.library.vo.BookVo;


/**
 * 사용자의 요청의 맞는 역할을 하는것
 * @author user
 *
 */

public class LibraryController {
	BookSerVice bookService = new BookSerVice();
	MemberSevice memberService = new MemberSevice();
	public void start() {
		System.out.println("========================");
		System.out.println("도서관에 오신걸 환영합니다");
		System.out.println("========================");
		
		// 로그인 요청
		while(true) {
		MemberVo memberVo = login();
		
		
		bookService.getList();
		
		if("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
			// 관리자 메뉴
			adminMenu();
		}else {
			userMenu();
		}
		}
	}
	
	public void adminMenu() {
		outter:
		while(true){
		System.out.println("============================================================");
		System.out.println("관리자 메뉴");
		System.out.println("1. 도서등록 2. 도서삭제 3. 사용자등록 "
				+ "4. 사용자삭제 0. 이전메뉴 q. 종료");
		System.out.println("============================================================");
		System.out.println("메뉴를 입력해주세요");
		int menu = getInt();
		int bookNo = 0;
		String id = "";
		switch (menu) {
		case 1:
			// 도서 등록
			System.out.println("도서 일련번호를 입력해주세요");
			bookNo = scan.nextInt();
			System.out.println("도서명을 입력해주세요");
			String title = scan.next();
			System.out.println("작가를 입력해주세요");
			String author = scan.next();
			
			bookService.insertBook(new BookVo(bookNo, title, author, "N"));
			break;
		case 2:
			// 도서 삭제
			System.out.println("삭제할 도서의 일련번호를 입력해주세요.");
			bookNo = getInt();
			
			bookService.deletBook(bookNo);
			break;
		case 3:
			// 시용자 등록
			System.out.println("등록할 아이디를 입력해주세요");
			id = scan.next(); 
			System.out.println("등록할 비밀번호를 입력해주세요");
			String pw = scan.next(); 
			System.out.println("등록할 이름을 입력해주세요");
			String name = scan.next(); 
			System.out.println("등록할 관리자계정은 Y를 입력해주세요");
			String adminYNStr = getString();
			String adminYN = adminYNStr.equalsIgnoreCase("y")?"Y":"N";
			
			MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
			memberService.insertMember(memberVo);
			break;
		case 4:
			// 사용자 삭제
			System.out.println("삭제할 아이디를 입력해주세요");
			id = scan.next();
			
			memberService.deletMember(id);
			break;
		case 0:
			System.out.println("로그인 메뉴로 이동하겠습니다.");
			break outter;
		default:
			System.out.println("메뉴를 확인후 다시 입력해주세요");
			break;
		}
	}
}


	public void userMenu() {
		outter:
		while(true) {
		System.out.println("============================================================");
		System.out.println("사용자 메뉴");
		System.out.println("1. 도서대여 2. 도서반납 0. 이전메뉴 q.종료");
		System.out.println("============================================================");
		int menu = getInt();
		int bookNo = 0;
		switch (menu) {
		case 1:
			System.out.println("대여할 도서의 일렬번호를 입력해주세요.");
			bookNo = getInt();
			
			bookService.rentBook(bookNo);
			break;
		case 2:
			System.out.println("반납할 도서의 일렬번호를 입력해주세요.");
			bookNo = getInt();
			
			bookService.returnBook(bookNo);
			break;
		case 0:
			System.out.println("로그인 메뉴로 이동하겠습니다.");
			break outter;
		default:
			System.out.println("메뉴를 확인후 다시 선택해 주세요");
			break;
		}
		}
		
	}
	
	/**
	 * 로그인
	 * ID/PW를 입력 받아서 일치하는 고객이 있는지 확인
	 * 로그인 성공할때까지 반복
	 * @return
	 */
	public MemberVo login() {
		while(true) {
		System.out.println("아이디를 입력해주세요");
		String id = getString();
		System.out.println("비밀번호를 입력해주세요");
		String pw = getString();
		MemberVo memberVo= memberService.login(id, pw);
		if(memberVo != null) {
			//로그인 성공
			return memberVo;
		}
		}
	}
	
	public static Scanner scan = new Scanner(System.in);
	
	public static String getString() {
		String str = "";
	
			str = scan.next();
			if(str.equalsIgnoreCase("q")) {
				//q,Q가 입력되면 종료
				System.exit(0);
			}
		return str;
		
	}
	
	public static int getInt() {
		int i =0;
		while(true) {
		try {
			String str = scan.next();
			if(str.equalsIgnoreCase("q")) {
				//q,Q가 입력되면 종료
				System.exit(0);
			}
			
			i = Integer.parseInt(str);
			return i;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("숫자 입력중 오류가 발생했습니다.");
		}
	}
}
}
