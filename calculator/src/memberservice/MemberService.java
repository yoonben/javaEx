package memberservice;

public class MemberService {
	
	public boolean login(String id,String password ) {
		//id.equals("hong")
		//id에 null이 들어올 경우 nullpointException이 발생할 우려가 있다
		//null이 아닌 경우 체크로직을 실행하거나 "hong".equals를 사용
		
		if("hong".equals(id) && "12345".equals(password)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되셨습니다.");
	}
	
	public static void main(String[] args) {
		MemberService MS = new MemberService();
		boolean login = MS.login("hong", "12345");
		if(login) {
			System.out.println("로그인 되셨습니다.");
			
		}else {
			System.out.println("id 또는 password가 틀리셨습니다.");
		}
		MS.logout("hong");
	}
}
