package forEx;

public class Ex04_02 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i <=100; i++) {
			if(i%3 != 0) {
				// 3의 배수가 아니면 증감식으로 이동
				// == 같으면 != 같지 않으면
				// break : 반복문 탈출 continue : 증감식으로 이동
				// continue 이후 명령문장을 실행하지 않고 증감식으로 이동
				continue;
			}
			System.out.println(i);
			sum+=i;
		}
		System.out.println("1부터 100까지 3의 배수 합은 "+sum);
	}
}
