package forEx;

import java.util.Scanner;

public class CalculatrMain {

	public static void main(String[] args) {
		//타입 변수명 = new 타입();
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		outter:
		while(true) {
			System.out.println("=============================================================");
			System.out.println("1. 더하기 | 2. 빼기 | 3. 곱하기 | 4.나누기 | 5.나머지 구하기 | 6. 종료");
			System.out.println("=============================================================");
			
			System.out.print("선택> ");
			int choise = scan.nextInt();
			
			if(choise==1) {
				System.out.print("더하기 첫번째수 > ");
				int a = scan.nextInt();
				System.out.print("더하기 두번째수 > ");
				int b = scan.nextInt();
				int res = calc.add1(a,b);	
				System.out.println("두 수의 합: "+res);
				
			}else if(choise==2) {
				System.out.print("빼기 첫번째수 > ");
				int a = scan.nextInt();
				System.out.print("빼기 두번째수 > ");
				int b = scan.nextInt();
				int res = calc.add2(a,b);
				System.out.println("두 수의 차: "+res);
				
			}else if(choise==3) {
				System.out.print("곱하기 첫번째수 > ");
				double a = scan.nextInt();
				System.out.print("곱하기 두번째수 > ");
				double b = scan.nextInt();
				double res = calc.add3(a,b);
				System.out.println("두 수의 곱: "+res);
				
			}else if(choise==4) {
				System.out.print("나누기 첫번째수 > ");
				double a = scan.nextInt();
				System.out.print("나누기 두번째수 > ");
				double b = scan.nextInt();
				double res = calc.add4(a,b);;	
				System.out.println("두 수의 나눗셈: "+res);
				
			}else if(choise==5) {
				System.out.print("나머지 첫번째수 > ");
				int a = scan.nextInt();
				System.out.print("나머지 두번째수 > ");
				int b = scan.nextInt();
				int res = calc.add5(a,b);	
				System.out.println("두 수의 나머지: "+res);
				
			}else if(choise==6) {
				break outter;
			}
		}
		System.out.println("프로그램 종료");
	}
}
