package forEx;

public class Continue {

	public static void main(String[] args) {
		//1~10까지의 수중에서 짝수에 합을 구해봅시다
				System.out.println("======짝수의 합 구하기=======");
				int sum = 0;
				for(int i = 1; i<=10; i++) {
					//홀수이면 증감식으로 넘어갑니다.
					// % : 나머지 연산자
					// 2로 나눈 나머지가 1이면 홀수 0이면 짝수
					if(i%2==1) {// 홀수이면
						continue;
					}
					System.out.println("i="+i);
					sum += i ;
				}
				System.out.println("1~10까지 짝수의 합은 : "+sum);
	}

}
