package forEx;

public class DoWhileEx {

	public static void main(String[] args) {
		
		int i =10;
		while(i<0) {
			System.out.println("0보다 작습니다.");
		}
		
		do {
			System.out.println("do-while무는 코드블럭을 무조건 1회 실행합니다.");
			System.out.println("1회 실행후 조건문이 참일때까지 반복 합니다.");
		}while (i < 0);
		
	}

}
