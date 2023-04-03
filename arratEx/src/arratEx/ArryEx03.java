package arratEx;

import java.util.Scanner;

public class ArryEx03 {

	public static void main(String[] args) {
		// new 연사로 배열을 생성하는 방법
		// String 타입의 배열을 만들어주세요 총 길이는 10으로 생성
		String[] names = null;
		int[] score;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 방을 만들까요");
		
		
		names[0] = "홍기동";		
		names[1] = "나몰라";		
		
		
		for(int i = 0;i<names.length;i++){
			System.err.println(names[i]);
		}
				
		// 타입 [] 변수명 = new 길이 
		// 타입에 맞고 기본탒으로 초기화 되어 갑자기 값이 입력된다
		// 정수 0. 실수 0.0, 
		
		
		
	}

}
