package arratEx;

public class Arrayunte {

	public static void main(String[] args) {
		//배열 선언
		int[] score ={0,20,30};
		//배열 선언한 후 중괄호를 사용해서 값을 입력하여 오우
		//1. 배열 선언후 생성하는 방법
		//변수명 = new 타입[] {값 목록}
		score = new int[] {10,20,30};
		
		
		//2. 배열 선언후 생성하는 방법
		//값의 목록이 없지만 미리 배열을 만드는 경우
		//차입[] 변수 = new 타입[길이]
		score = new int[10];
		System.out.println("새로운 10개의 저장공간을 만들었어요!");
		
		//초기화/조건심/증감시
		for(int i =0;i<score.length;i++) {
			System.out.println(score[i]);
	
		}
			
		
		// java.lang.ArrayInr
		// 배열의 인뎃스는 0부터 시작
		// 배열의 총길이를 갯수로 변환한다
		// 배열의 idex값을 초과하는 방법호가 입력된 경우
	

	}
	}



