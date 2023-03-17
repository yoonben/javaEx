package loof;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 별의 숫자를 입력하시오: ");
		int sum = scan.nextInt();

		for(int i = 1; i<=sum; i++) {
			for(int j=1;j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
