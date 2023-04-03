package sco01.exam04;

public class Car {
	// 인터페이스는 객체를 생성할 수 없다.
	// Tire tire = new Tire(); <--- 오류
	// 인터페이스의 구형체인 경우, 
	// 인터페이스를 참조변수의 타입으로 사용 할 수 있다
	Tire tire;

	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public void run() {
		tire.roll();
	}
}
