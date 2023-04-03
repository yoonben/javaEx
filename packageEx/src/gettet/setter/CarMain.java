package gettet.setter;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		// private 접근제한자를 이용할 경우
		// 필드에 직접 접근할 수 없으므로
		// setter메서드를 이용해서 필드의 값을 변경 시켜 줄 수 있다.
		car.setSpeed(-50);
		System.out.println("현재 속도는 "+ car.getSpeed());
		
		car.setSpeed(50);		
		System.out.println("현재 속도는 "+ car.getSpeed());

		car.setStop(true);

		// true / 생성되었을때 : false
		// 멈추지 않은 상태라면 멈추는 메서드를 호출
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도는 "+ car.getSpeed());
	}

}
