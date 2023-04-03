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
		
//		System.out.println("\n2. 문자 출력 ");
//		System.out.print("얼마나 출력하실껀가가요 : ");
//		a = scan.nextInt();
//		System.out.print("출력할 알파벳을 입력하시오 : ");
//		b = scan.next().charAt(0);
//		non.outputChar(a, b);

		
		System.out.println("\n3. 랜덤 영문자 출력 : "+non.alphabette());
		//            0123456 78
		String str = "안녕하세요, 반갑습니다";
		// 특정 문자열을 추출하는 방법
		// 원하는 위치의 문자열을 추출하여 반환해주므로
		// 원본은 수정되지 않는다.
		non.mySubstring(str, 1, 5);
		System.out.println("원본 : "+str);
		}
}
