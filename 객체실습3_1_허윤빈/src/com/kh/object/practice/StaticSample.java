package com.kh.object.practice;

public class StaticSample {
	//필드
	// 접근제한자가 private이므로 직접 접근이 불가능 합니다.
	// setter, getter 메서드를 이용합니다.
	private static String value;
	
	//메서드
	public static void toUpper() {
		// 모두 대문자로 변경
		value = value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value값을 전달받은 문자로 변경하는 staic 메서드
		// String문자열을 char[]로 반환
		char[] valueArr =  value.toCharArray();
		// 배열이름[방번호] = 값;
		// 값을 배열의 방번호에 입력 -> 덮어쓰기
		valueArr[index] = c;
		
		// String으로 변환
		value = String.valueOf(valueArr);
		
//		System.out.println("char 출력===============");
//		for(char cahrValue : valueArr) {
//			System.out.println(cahrValue + "");
//		}
	}
	
	public static int valueLength() {
		// str.length : 문자열의 길이를 반환
		return value.length();
	}
	
	public static String valueConcat(String str) {
		// str.concat : 문자열을 연결하여 반환
		// value = value.concat(str);
		return value.concat(str);
	}

	//setter/getter
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
}

