package forEx;

import java.util.Scanner;

public class Ex04_07_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		int total = 0;
		/*outter: while (true) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				System.out.print("예금액> ");
				money = scan.nextInt();
				total += money;
				System.out.println("잔고> " + total);
				break;
			case 2:
				System.out.print("예금액> ");
				money = scan.nextInt();
				if (total >= money) {
					total -= money;
					System.out.println("잔고> " + total);
				} else {
					System.out.println("잔고가 부족합니다.");
				}
				break;
			case 3:
				System.out.println("잔고> " + total);
				break;
			case 4:
				break outter;
			default:
				System.out.println("다시 입력해주시기 바랍니다.");
				break;
			}
		}
		System.out.println("프로그램을 종료");
		 */

		while (true) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int num = scan.nextInt();
			if (num == 1) {
				System.out.print("예금액> ");
				money = scan.nextInt();
				total += money;
				System.out.println("잔고> " + total);
			} else if (num == 2) {
				System.out.print("예금액> ");
				money = scan.nextInt();
				if (total >= money) {
					total -= money;
					System.out.println("잔고> " + total);
				} else {
					System.out.println("잔고가 부족합니다.");
				}
			} else if (num == 3) {
				System.out.println("잔고> " + total);
			} else if (num == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
