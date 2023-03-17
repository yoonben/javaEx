package com.junang;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String x = scan.next();
		
		System.out.print("두 번째 수: ");
		String y = scan.next();
		
		System.out.println("---------------");
		
		double f = Double.parseDouble(x);
		double z = Double.parseDouble(y);
		if(z==0) {
			System.out.println("결과: 무한대");
		}else {
			System.out.printf("결과: %.2f", (f/z));
		}
	}

}
