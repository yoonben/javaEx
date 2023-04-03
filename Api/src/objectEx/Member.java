package objectEx;

public class Member {
	public static void main(String[] args) {
		Member mem1 = new Member("id");
		Member mem2 = new Member("id");
		
		System.out.println("=======================");
		/**
		 * hashCode()
		 * 
		 * 객체를 식별하는 하나의 정수값
		 * Object클래스의 객체 해시코드 메소드는 객체 메모리 번지를 이용하여
		 * 해시코드를 만들어 리턴 합니다.
		 * ====>>> 객체마다 다른 값을 가집니다.
		 * 
		 * 두 객체가 동둥핝 비교하는데 사용되어 집니다.
		 */
		Object obj = new Object();
				
		
		System.out.println(mem1.hashCode());
		// 16진수로 변환
		String str = Integer.toHexString(mem1.hashCode());
		str.equals(str);
		
		
		System.out.println("hashCode() 16진수로 변환 : "+str);
		System.out.println(mem1.toString());
		System.out.println("=======================");
		
		
		// equals : 두 객체를 비교 합니다.
		System.out.println("mem1.equals(mem2) : ");
		System.out.println(mem1.equals(mem2));
	}
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	/**
	 * this(Member객체)가 가지고 있는 id 값과
	 * 매개변수로 받은 Object의 id값이 일치 하는지 비교
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			System.out.println("Object.equals() 결과 : " 
										+ super.equals(obj));
			System.out.println("Member.equals() 결과 : " 
										+ getId().equals(member.id));

			// 객체가 가지고 있는 id값이 같다면 true 아니면 false;
			if(getId().equals(member.id)) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
