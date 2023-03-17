package bmi;

import java.io.IOException;

public class WhileEx {
	
	
	
	/**
	 * 키보드로부터 입력된 키코드를 출력합니다.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// while(){} : 반복문
		// ()안의 값이 참이면 코드블럭을 계속해서 실행한다.
		System.out.println("키보드 입력을 기다리는 중입니다.");
		
		//반복 ()안의 조건이 true이면 계속해서 코드블럭을 실행 한다.
		while(true) {
			// 사용자의 입력을 대기
			// || : 이거나 또는
			// input 변수의 값이 81 이거나 113이면 코드블럭을 실행한다.
			int input = System.in.read();
			if(input == 81 || input == 113) {
				// 반복문을 탈출 ( 내가 속해있는 반복문의 코드블럭을 탈출)
				break;
			}
			// 코드는 위에서 아래로 실행된다.
			// q를 입력했을 경우 출력되지 않도록 if문장 아래로 출력 위치를 변경
			System.out.println("keycode: "+input);
		}
		System.out.println("종료합니다.");
	}
}
