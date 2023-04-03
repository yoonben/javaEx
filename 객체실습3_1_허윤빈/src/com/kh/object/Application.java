package com.kh.object;

import com.kh.object.practice.StaticSample;

public class Application {
	public static void main(String[] args) {
		// StaticSamole의 value 필드 값을 초기화
		
		// 정적 멤버 접근:
		// 클래스명.필드명 - 필드가 private 접근제한자 이므로 직접 접근 안됨
		// 클래스명,메서드명
		StaticSample.setValue("Java");
		// 직접 접근이 안되므로 get메서드를 활용하여 필드값을 추출
		System.out.println("value : "+StaticSample.getValue());
		//toUpper 실행후 value값 출력
		// 메서드 호출
		StaticSample.toUpper();
		System.out.println("대문자로 변경 : "
									+StaticSample.getValue());
		
		//2번째 인데스의 값을 j로 변경
		StaticSample.setChar(2, 'j');
		// 인덱스는 0부터 시작 되므로 3번째 값 변경
		System.out.println("3번째 값을 j로 변 : "
									+StaticSample.getValue());
		
		System.out.println("문자열의 길이 : "
									+StaticSample.valueLength());
		
		System.out.println("문자열 연결 : "
									+StaticSample.valueConcat("PROGRAMING"));
	}
}
