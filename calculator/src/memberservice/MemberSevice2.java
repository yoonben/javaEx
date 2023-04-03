package memberservice;

import java.util.Scanner;

public class MemberSevice2 {
	
	public String id;
	public String password;
	
	//생성자
	public MemberSevice2(String id,String password) {
		this.id =id;
		this.password = password;
	}
	
	//로그인
	public boolean login(String id,String password ) {
	if(this.id.equals(id)&&this.password.equals(password)) {
		return true;
	}else {
		return false;
	}
		
	}
	//로그아웃
	public void logout(String id) {
		System.out.println(this.id+"님이 로그아웃 하셨습니다.");
	}
	
		public static void main(String[] args) {
			int i = 0;
		MemberSevice2 ms = new MemberSevice2("hong", "12345");
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.print("아이디를 입력해주세요 : ");
		String id = scan.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		String password = scan.next();
		boolean login = ms.login(id,password);
		
		if(login) {
			System.out.println(ms.id+"님이 로그인 하셨습니다.");
			break;
		}else {
			System.out.println("id 또는 password가 틀리셨습니다.");
			i++;
			if(i>=5) {
				System.out.println("시스템을 종료 합니다");
				System.exit(0);
			}
		}
	}
		ms.logout("");		
}
		

}
