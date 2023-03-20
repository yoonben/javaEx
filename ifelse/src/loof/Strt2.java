package loof;

import java.util.Scanner;

public class Strt2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 별의 숫자를 입력하시오: ");
		int sum = scan.nextInt();

		for(int i = 1; i<=sum; i++) {
			for(int j = sum; j >0; j--) {
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
