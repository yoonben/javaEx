package com.kh.object.practice;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		int lotto[] = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)((Math.random()*45)+1);
			for(int j = 0; j <i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			// 오름차순 /내림차순
			for(int j = i; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					// 방바꾸기
					int temp = lotto[i];
					// 작은수가 앞으로 올수 있도록 자리바꿈
					lotto[i] = lotto[j];
					// 큰수를 뒤로 이동
					lotto[j] = temp;
				}
			}
		}
		
		for(int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void outputChar(int num,char c) {
		// 입력받은 숫자만큼 반복문을 실행
		for(int i=0;i<num;i++) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	public char alphabette() {
		char alphabette = (char)((Math.random()*24)+97);
		return alphabette;
	}
	
	public String mySubstring(String str, 
					int index1, int index2) {
		// 문자열의 인덱스값을 이용하여 문자열을 추출
		// 시작인덱스는 포함하고 끝인덱스는 불포함
		// 문자열 추출시 이용
		return str.substring(index1, index2);
	}
}
