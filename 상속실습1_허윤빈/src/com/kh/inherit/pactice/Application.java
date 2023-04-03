package com.kh.inherit.pactice;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		student[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		student[2] = new Student("강개순", 23, 16.0, 45.0, 4, "정보통신공학과");
		
		for(Student i : student) {
			System.out.println(i.infomation());
		}
		
		
		Employee[] empoloyee = new Employee[10];
		
		Scanner scan = new Scanner(System.in);
		int index = 0;
		while(true) { 
			
			System.out.println("이름 : ");
			String name = scan.next();
			
			System.out.println("나이 : ");
			int age = scan.nextInt();
			
			System.out.println("신장 : ");
			double height = scan.nextDouble();
			
			System.out.println("몸무게 : ");
			double weight = scan.nextDouble();
			
			System.out.println("급여 : ");
			int salary = scan.nextInt();
			
			System.out.println("부서 : ");
			String dept = scan.next();
			
			// 매개변수 생성자를 이용하여 필드를 초기화
			Employee emp = new 
					Employee(name, age, height, weight, salary, dept);
			// 사용자로부터 입력받은 값으로 사원을 생성하고
			// 배열에 저장
			empoloyee[index] = emp;
			// 사원이 입력된 후 다음번 방을 가르킴
			index++;
			
			// 반목문 탈출
			System.out.println("종료하시려면 n을 입력해주세요");
			String next = scan.next();
			if(next.equals("n")|| index == 10) {
				break;
			}
		}
		
		for(Employee e : empoloyee) {
			// null 체크
			// 배열이 초기화 될때 null값으로 초기화
			// e. <-- 주소접근자 . 을 이용할경우
			// null은 주소를 가지고 있지 않으므로 오류가 발생!!!
			if (e == null) {
				break;
			}
			System.out.println(e.information());
		}
		
		
		
		
		
		
		
		
	/*	outer:while(true) {
			// 이름, 나이 ,신장 ,몸무게, 급여 ,부서
			for(int i = 0;i<10;i++) {
				
				System.out.print("이름을 입력하시오 : ");
				String name = scan.next();
				
				System.out.print("나이를 입력하시오 : ");
				int age = scan.nextInt();
				
				System.out.print("신장을 입력하시오 : ");
				double height = scan.nextDouble();
				
				System.out.print("몸무게을 입력하시오 : ");
				double weight = scan.nextDouble();
				
				System.out.print("급여을 입력하시오 : ");
				int salary = scan.nextInt();
				
				System.out.print("직무를 입력하시오 : ");
				String dept = scan.next();
				empoloyee[i] = new Employee(name, age, height, weight, salary, dept);
				
				System.out.println("계속 저장을 하실거면 y 아니면 n을 입력하세요.");
				String ex = new String();
				ex = scan.next();
				
				int num1 = 0;
				while(true) {
					num1++;
				if(ex.equals("y")) {
					break;
				}else if(ex.equals("n")||num1 == 10) {
					for(Employee j : empoloyee) {
						System.out.println(j.information());
					}
					System.out.println("입력 받은 사원 수 : "+num1);
					break outer;
				}else if(!ex.equals("y")&&!ex.equals("n")){
					System.out.println("계속 저장을 하실거면 y 아니면 n을 입력하세요.");
					ex = scan.next();
				}
				}
				}
			
			
		}*/
	}

}
