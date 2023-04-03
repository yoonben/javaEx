package com.kh.object;

import com.kh.object.practice.Product;

public class Applocation {

	public static void main(String[] args) {
		//매개변수 생성자를 이용하여 3갸의 객체 생성
		Product pro0 = 
				new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product pro1 = 
				new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product pro2 = 
				new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(pro0.information());
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		
		pro0.setPrice(1200000);
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);
		
		pro0.setTax(0.05);
		pro1.setTax(0.05);
		pro2.setTax(0.05);
		
		System.out.println("=========================================");
		System.out.println(pro0.information());
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println("=========================================");
		
		pro0.calc();
		pro1.calc();
		pro2.calc();
	}

}
