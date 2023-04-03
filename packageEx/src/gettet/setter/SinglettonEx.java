package gettet.setter;

public class SinglettonEx {
	
	private static SinglettonEx singleton = new SinglettonEx();
	
	// 1.private접근제한자를 이용하여
	// 생성자를 외부에서 이용하지 못하도록 막는다.
	private SinglettonEx() {
		
	}
	
	// 2. 외부에서 접근할 수 있는 메서드를 만들고
	// 생성된 객체를 반환한다.
	//		-생성을 할 수 업으므로 정적 메서드로 만들어야 한다
	//		-정적 필드에 자신을 생성하여 리턴해준다.
	public static SinglettonEx getInstance() {
		// 정적 메서드에서는 정적필드, 정적메서드만 사용이 가능하다.
		return singleton;
	}
	
}
