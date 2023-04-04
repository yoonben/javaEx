package com.chap1;

import java.io.File;

public class A_File {
	public static void main(String[] args) {
		// 객체 생성
		A_File a = new A_File();
		// 메서드 실행 : 레퍼런스변수에 주소접근연산자(.)을 이용 합니다.
		a.method1();
	}
	public void method2() {
		//File file = new File("d:/test.txt");
		File file = new File("d:/test/test.txt");
		File dir = new File("d:/test");
		try {
			// 한개의 디렉토리 만들기
			dir.mkdir();
			
			// 경로내의 디렉토리가 여러개 생성 되어야 할 겅우
			// dir.mkdirs();
			
			// 파일 생성
			file.createNewFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public void method1(){
		// 경로를 지정하지 않으면 현재 프로젝트폴더에 파일을 생성합니다.
		// 메모리 상에만 존재
		File file = new File("test.txt");
		
		System.out.println("파일명 : "+file.getName());
		System.out.println("절대 경로 : "+file.getAbsolutePath());
		System.out.println("상대 경로 : "+ file.getPath());
		System.out.println("파일 용량 : "+file.length());
		System.out.println("파일 존재 여부 : "+file.exists());
		
		// 실제 파일 생생
		try {
			file.createNewFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
