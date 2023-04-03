package arratEx;

public class ArrayEx5 {
	// 접근제어자  변환타입 메서드이름(타입)
	// void : 반환 타입이 없다는 의미
	// int, String
	// 매개변수: (타입 변수명)   
	// 매개변수 : 있다면 타입을 명시 해줘야한다.
	public static void main(String[] args) {
		System.out.println(args.length);
		
		// !.=로컬 2= 테스트 3. 운영
		int mode = Integer.parseInt(args[0]);
		if(mode ==1) {
			System.out.println("로컬환경입니다.");
		}else if(mode==2) {
			System.out.println("테스트 환셩입니다.");
		}else if(mode==3) {
			System.out.println("운영환경 환셩입니다.");
		}
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
			
		}
		
	}

}
