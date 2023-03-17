package loof;

public class Ex02 {

	public static void main(String[] args) {
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		while(true) {
			num1 = (int)(Math.random()*6+1);
			num2 = (int)(Math.random()*6+1);
			sum = num1 + num2;
			if(sum == 5) {
				System.out.printf("첫번째 주사위는 %d, 두번째 주사위는 %d  두합을 더하면 5이기 때문에 종료합니다.",num1,num2); break;
			}
		}
	}

}
