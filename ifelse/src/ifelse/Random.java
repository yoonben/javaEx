package ifelse;

public class Random {

	public static void main(String[] args) {
		double num = Math.random();
		// 0~5.44567765
		int numRes = (int)((num * 7)+1);
		
		switch(numRes){
			case 1:
				System.out.println("1번이 나왔습니다");break;
			case 2:
				System.out.println("2번이 나왔습니다");break;
			case 3:
				System.out.println("3번이 나왔습니다");break;
			case 4:
				System.out.println("4번이 나왔습니다");break;
			case 5:
				System.out.println("5번이 나왔습니다");break;
			case 6:
				System.out.println("6번이 나왔습니다");break;
			default:
				System.out.println("======= 종료 =======");break;
		}
		
		// Math.random()
		// 0.0 ~ 1.0 사이의 무작위수를 추출하여 double 타입으로 변환
		// 0.00000...1 - 0.99999...9
		// 10을 곱하면 0~9
		// 100을 곱하면 0~99
		
		int randum =0;
		
		int i = 0;
		while(true) {
			randum = (int)(Math.random()*45)+1;
			System.out.print(randum + " ");
			i++;
			if(i==5) {
				break;
			}
		}
		
		/*if(randum == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(randum == 2){
			System.out.println("2번이 나왔습니다.");
		}else if(randum == 3){
			System.out.println("3번이 나왔습니다.");
		}else if(randum == 4){
			System.out.println("4번이 나왔습니다.");
		}else if(randum == 5){
			System.out.println("5번이 나왔습니다.");
		}else if(randum == 6){
			System.out.println("6번이 나왔습니다.");
		}*/
		
	}

}
