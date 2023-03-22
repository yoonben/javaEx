package Member.object;

public class MemberMain {

	public static void main(String[] args) {
		Member mem = new Member();
		System.out.println("이름: "+mem.name);
		System.out.println("아이디: "+mem.id);
		System.out.println("패스워드: "+mem.password);
		mem.age();
		System.out.println("나이: "+mem.age);
	}

}
