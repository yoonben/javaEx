package com.kh.object.practice;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		int arry[] = new int[6];
		int temp = 0;
		
		for(int i = 0; i < arry.length; i++) {
			arry[i] = (int)((Math.random()*45)+1);
			for(int j = 0; j <i; j++) {
				if(arry[i]==arry[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < arry.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arry[i] > arry[j]) {
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		
		for(int i : arry) {
			System.out.print(i + " ");
		}
	}
	
	public void outputChar(int num,char c) {
		
	}
	
	public char alphabette() {
		char alphabette = (char)((Math.random()*24)+97);
		return alphabette;
	}
	
	public String mySubstring(String str, 
					int index1, int index2) {
		return "";
	}
}
