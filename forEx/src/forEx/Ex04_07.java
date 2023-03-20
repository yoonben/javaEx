package forEx;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		int money = 0;
		int total = 0;
		//outter
		while(run) {
			System.out.println("================================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("================================");
			System.out.print("선택> ");
			
			// scan. next()// 사용자의 입력을 문자열로 변환
			balance = scan.nextInt();// 사용자의 입력을 숫자로 반환
			//switch (변수){
			//  case 변수의 값
			//}
			switch (balance) {
			case 1:
				System.out.print("예금액> ");
				money = scan.nextInt();
				total += money; 
				System.out.println("잔고> "+total);
				break;
			case 2:
				System.out.print("출금액> ");
				money = scan.nextInt();
				if(total>=money) {
					total -= money;
					System.out.println("잔고> "+total);
				}else {
					System.out.println("잔고가 없습니다.");
				}
				break;
			case 3:
				System.out.println("잔고> "+total);
				break;
			case 4:
				//System.exit(0); 메인 메소드 종료
				// 반복문을 탈출
				run = false;
				//break outter;
				break;
			default: 
				System.out.println("다시 입력해주세요.");
				break;
			}
				
				
			
			/*if(balance == 1) {
				System.out.print("예금액> ");
				money = scan.nextInt();
				total += money;
			}else if(balance == 2) {
				System.out.print("출금액> ");
				money = scan.nextInt();
				if(total>=money){
				total -= money;}else
				{System.out.print("잔고가 부족합니다.");}
			}else if(balance == 3) {
				System.out.print("잔고> "+total+"\n");
			}else if(balance == 4) {
				run = false;
			}*/
		}
		System.out.println("===========프로그램 종료");
	}

}
