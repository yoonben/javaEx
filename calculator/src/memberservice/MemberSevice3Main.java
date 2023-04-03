package memberservice;

import java.util.Scanner;

public class MemberSevice3Main {

	public static void main(String[] args) {
		MemberService3 service = new MemberService3("홍길동","1234");
		Scanner scan = new Scanner(System.in);
		
		//boolean res = service.login("홍길동", "1234");
		while(true) {
		System.out.print("id : ");
		String id = scan.next();
		System.out.print("pw : ");
		String pw = scan.next();
		
		boolean res = service.login(id, pw);
		
		if(res) {
			System.out.println("환영합니다");
			break;
		}else {
			System.out.println("id/pw가 일치하지 않습니다.");
		}
		}
		System.out.println("로그아웃을 하시려면 q를 입력해주세요");
		String exit = scan.next();
		if("q".equals(exit)) {
			System.exit(0);
		}
		}
	
}
