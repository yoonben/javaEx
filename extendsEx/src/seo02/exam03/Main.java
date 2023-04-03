package seo02.exam03;

public class Main {

	public static void main(String[] args) {
		// 자동차 객체를 생성
		Car car = new Car();
		
		//10번 샐행
		for(int i =0;i<10;i++) {
			//
			int res = car.run();
			if(res> 0) {
				car.changeTire(res);
			}
			
		}
	}

}
