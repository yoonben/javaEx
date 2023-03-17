package loof;

public class While {
	public static void main(String[] args) {
		int sum =0;
		int i = 1;
		
		while (i<=100) {
			System.out.println("while 출력: "+ i);
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지의 합은 "+sum);
	}
}
