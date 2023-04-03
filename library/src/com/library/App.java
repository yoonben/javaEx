package com.library;

import java.util.Scanner;

public class App {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		App app = new App();
		System.out.print("이름을 입력해주세요 : ");
		System.out.println("이름 : "+app.getString());
		System.out.print("나이을 입력해주세요 : ");
		System.out.println("나이 : "+app.getInt());
	}
	
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
				System.out.println("프로그램을 종료하겠습니다.");
				System.exit(0);
			}
			break;
		} catch (Exception e) {
			System.err.println("입력중에 에러가 발생했습니다.");
			System.err.println("문자를 입력해주세요.");
		}
		}
		return res;
	}
	
	public int getInt() {
		int i = 0;
		while(true) {
		try {
			String res = scan.next();
			if(res.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료하겠습니다.");
				System.exit(0);
			}
			i = Integer.parseInt(res);
			break;
		} catch (Exception e) {
			System.err.println("입력중에 에러가 발생했습니다.");
			System.err.println("숫자를 입력해주세요.");
		}
		}
		return i;
	}
	
}
