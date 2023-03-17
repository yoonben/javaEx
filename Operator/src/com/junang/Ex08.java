package com.junang;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height =7;
		double area = ((double)(lengthTop+lengthBottom)*7/2);
		System.out.println(area);
		System.out.println("===================================");
		int var1 =10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1*var1*Double.parseDouble(var2+"."+var3);
		System.out.println("원의 넓이: "+var4);
		System.out.println("===================================");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String name = scan.nextLine();
		
		int password;
		
		if("java".equals(name)) {
			System.out.println("패스워드: ");
			String strPassword = scan.nextLine();
			password = Integer.parseInt(strPassword);
			if( password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패:패스워드 틀림");
			}
			
		}else {
			System.out.println("아이디 존재하지 않음");
		}
	}

}
