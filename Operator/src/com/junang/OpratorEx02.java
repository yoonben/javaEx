package com.junang;

public class OpratorEx02 {

	public static void main(String[] args) {
		int x = 10, y= 5, z=3;
		
		// 삼항 연산자
		// (조건)? 참: 거짓
		int score = 95;
		String res = (score>90)?"A":(score>80?"B":"C");
		System.out.println(res);
		
		// 대입연산자
		// 왼쪽의 값을 오른쪽에 대입
		
		x=10;
		x+=10; // x=x+10
		x*=10; // x=x*10
		x%=10; // x=x%10
		
		boolean t = true;
		t|= false; // t = true | false
		
		// 그리고 2개의 항이 모두 true 일때 true
		// & : 두항 모두 연산하고 비교한다.
		// && : 첫번째 항이 false일경우 두번째 항은 확인하지 않는다.
		if(x>y && x>z) {
			
		}
		//또는 두개의 항중 하나만 true 여도 true
		// | : 두항 모두 연산하고 비교한다.
		// || : 첫번째 항이 true일경우 두번째 항은 확인하지 않는다.
		if(x>y || x>z){
			
		}
	}

}
