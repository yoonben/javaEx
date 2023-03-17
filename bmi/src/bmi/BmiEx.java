package bmi;

public class BmiEx {

	public static void main(String[] args) {
		/* 키 1.6 몸무게 55kg
		 몸무게/(키*키)
		 변수의 타입 변수명 =값 ;
		 = 대입연산자
		 오른쪽에 있는 값을 왼쪽의 변수에 저장*/
		
		double height = 1.6;
		int weight = 55; // 실수와 정수의 연산은 정수 55가 실수 55.0 으로 자동변환 되어짐
		
		double bmi = weight/(height*height); 
		
		System.out.println("환영합니다.");
		System.out.println("당신의 BMI는 "+ bmi+"입니다.");
		// %d 정수,%f 실수,%s 문자
		System.out.printf("당신의 BMI는 %.1f입니다.", bmi);
	
	}

}
