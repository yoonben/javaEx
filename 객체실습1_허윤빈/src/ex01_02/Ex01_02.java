package ex01_02;

import ex01_01.Ex01_01;

public class Ex01_02 {
	public static void main(String[] args) {
		
		Ex01_01 ex01 = new Ex01_01("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Ex01_01 ex02 = new Ex01_01("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Ex01_01 ex03 = new Ex01_01("ktsnote3", "KT스마트폰3", "서울시 강남", 250000 ,0.3);
		
		System.out.println(ex01.informaiton());
		System.out.println(ex02.informaiton());
		System.out.println(ex03.informaiton());
		System.out.println("========================================");
		
		ex01.setPrice(1200000);
		ex02.setPrice(1200000);
		ex03.setPrice(1200000);
		
		ex01.setTax(0.05);
		ex02.setTax(0.05);
		ex03.setTax(0.05);
		
		System.out.println(ex01.informaiton());
		System.out.println(ex02.informaiton());
		System.out.println(ex03.informaiton());
		System.out.println("========================================");
		
		ex01.result();
		ex02.result();
		ex03.result();
	}
}
