package loof;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 구구단 숫자를 입렵하시오: ");
		int gugudan = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=9; i++) {
			sum = gugudan*i;
			System.out.printf("%d x %d 는 %2d  (%d단)\n",gugudan,i,sum,gugudan);
		}
	}

}
