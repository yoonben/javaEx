package com.StringEx;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		// 매개값의 문자열을 포함하고 있으면
		// 포함 : 시작인덱스값을 반환
		// 불포함 : -1 반환
		
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("C"));
		
		// subString과 함께 사용 될 수 있다.
		System.out.println(str.substring(str.indexOf("프로")));
		
		if(str.indexOf("자바") > 0) {
			System.out.println("자바 관련 책!");
		}else {
			System.out.println("자바와 관련 없음");
		}
		

		// 문자의 길이를 반환 합니다.
		// id의 길이는 5자 이상 이여야 합니다.
		String id = "";
		if(id.length()<5) {
			System.out.println("아이디는 5자 이상 14자 이하로 작성 가능합니다.");
		}
		String ssn = "1234561234567";
		if(ssn.length() !=13) {
			System.out.println("주민등록번호를 정확히 입력해주세요");
		}
		
		// 원하는 문자열을 추출
		// 시작인덱스 포함, 끝 인덱스 불포함
		System.out.println("주민번호 앞자리 : "+ssn.substring(0,6));
		System.out.println("주민번호 뒷자리 : "+ssn.substring(6));
		
		// 문자 교체
		str = "자바는 객체지향 언어 입니다. 자바를 자바봅시다";
		System.out.println(str.replace("자바", "java"));
		
		// 대소문자 교체
		str = "Java Programe Language";
		
		// 대문자로 변경
		System.out.println("대문자로 변경 : "+str.toUpperCase());
		// 소문자로 변경
		System.out.println("소문자로 변경 : "+str.toLowerCase());
		
		// 대소문자로 구분하지 않고 비교
		str = "q";
		System.out.println(str.equalsIgnoreCase("Q"));
		System.out.println(str.equalsIgnoreCase("q"));
		
		// 공백을 제거해주기
		id = "            id";
		System.out.println("공백 제거 전 : "+id);
		System.out.println("공백 제거 후 : "+id.trim());
		
		// 기본타입을 문자로 변경
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.5));
		System.out.println(String.valueOf(true));
		
	}

}
