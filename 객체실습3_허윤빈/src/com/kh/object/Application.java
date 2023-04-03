package com.kh.object;

import java.util.Scanner;

import com.kh.object.practice.NonStaticSample;

public class Application {
	public static void main(String[] args) {
		char b;
		int a;
		NonStaticSample non = new NonStaticSample();
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("1. 랜덤 값 : ");
		non.printLottoNumbers();
		
		System.out.print("\n\n얼마나 출력하실껀가가요 : ");
		a = scan.nextInt();
		System.out.print("출력할 알파벳을 입력하시오 : ");
		b = scan.next().charAt(0);
		non.outputChar(a, b);
		System.out.println("2. 출력 ");
		
		
		System.out.println("\n3. 랜덤 영문자 출력 : "+non.alphabette());
	}
}
