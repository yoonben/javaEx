package bmi;

import java.util.Scanner;

public class Ex01 {
	private static Scanner scan;

	public static void main(String[] args) {
		int num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요(-50000이상 50000이하로 입력): ");
        while(true) {
        	num1 = scan.nextInt();
            if(num1 >= -50000 && num1 <= 50000)
            {
                    break;
            }else{
                System.out.println("다시 num1 입력해주세요(-50000이상 50000이하로 입력): ");
            }
        }
        System.out.println("두번째 숫자를 입력하세요(-50000이상 50000이하로 입력):");
        while(true){
            num2 = scan.nextInt();
            if(num2 >= -50000 && num2 <= 50000)
            {
                break;
            }else{
                System.out.println("다시 num2 입력해주세요(-50000이상 50000이하로 입력): ");
            }
        }
        int rejult = num1 + num2;
        System.out.printf("num1이 %d이고 num2가 %d 두 숫자의 합은 %d입니다. ", num1, num2, rejult);
	
        System.out.println("수정본");
	}
}
