package loof;

public class Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 3; i<=100; i=i+3) {
			System.out.println("for문 출력:"+i);
			sum += i;
		}
		System.out.println("1부터 100까지 중에서 3의 배수의 합은: "+ sum);
	}

}
