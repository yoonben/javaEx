package forEx;

public class Ex04_05 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// 1,2,3,4
		System.out.println("반복 시작==============");
		for(int i = 1; i<5;i++) {
			// *을 출력
			// j <= i
			// ========
			// 1 <= 1
			// 2 <= 1
			// ========
			// 1 <= 2
			// 2 <= 2
			// 3 <= 2 -> 조건 불일치
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			// 줄 바꿈
			System.out.println();
		}
		System.out.println("반복 끝===============");
	}

}
