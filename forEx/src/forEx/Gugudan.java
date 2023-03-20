package forEx;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 출력하기
		// for(초기식;조건식;증감식){}
		// i를 1~9까지 출력 해봅시다
		
		//dan: 2 ~ 9
		
		Outter : 
		for(int dan = 2; dan<10; dan++) {
			
			System.out.println(dan+"단");
			//fot 시작
			// i : 1~9
			// dan == 6
			for(int i=9; i>0; i--) {
				//만약 6단이면 구구단을 출력하지마
				if(dan == 6) {
					// Label의 위치까지 반복문을 탈출합니다.
					break Outter;
				}
				//System.out.println("i="+ i);
				//System.out.println(dan+ "*" + i + "=" + dan*i);
				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
				
			}
			// for 종료
			
			/* 6단을 출력한 후 반복문을 탈출합니다
			if(dan == 6) {
				break;
			}*/
			System.out.println();
		}//for 종료
	}//main 코드블럭 종료

}
