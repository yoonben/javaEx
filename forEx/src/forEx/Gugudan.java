package forEx;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 출력하기
		// for(초기식;조건식;증감식){}
		// i를 1~9까지 출력 해봅시다
		
		// 2 ~ 9
		for(int dan = 2; dan<10; dan++) {
			
			System.out.println(dan+"단");
			//fot 시작
			// i : 1~9
			for(int i=9; i>0; i--) {
				//System.out.println("i="+ i);
				//System.out.println(dan+ "*" + i + "=" + dan*i);
				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
			}
			// for 종료
			
			System.out.println();
		}
	}

}
