package forEx;

public class Ex04_03 {

	public static void main(String[] args) {
		// 두개의 주사위를 던져서 나온수
		// 1 ~ 6 까지 6개의 수가 나올 수 있다
		// 0.000....1 <= Math.random() < 1
		// 0.000....1 <=               <0.999...9
		// 0.000....6 <=               <5.4...... *을 했을때
		// 0.000....6 <=               <6.4...... +1을 해서 초기값을 지정
		// 0보다 크거나 같고 5보다 작은 값을 추출 0,1,2,3,4,5
		// 포기값 지정 (+) + 1
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		while(true) {
			num1 = (int)(Math.random()*6+1);
			num2 = (int)(Math.random()*6+1);
			sum = num1 + num2;
			if(sum==5) {
				System.out.println("첫번째 주사위는 : "+ num1);
				System.out.println("두번째 주사위는 : "+ num2);
				System.out.println("두 주사위의 합은 : "+ sum);
				break;
			}
		}
	}

}
