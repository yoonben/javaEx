package loof;

import java.util.Scanner;

public class Strt2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 별의 숫자를 입력하시오: ");
		int sum = scan.nextInt();

		for(int i = 0; i<=sum; i++) {
			for(int j = sum;j>=i;j--) {
			System.out.print("*");
			for(int k=sum; k>j; k++) {
				System.out.println(" ");
			}
			}
			
			System.out.println();

		}
	}

}
