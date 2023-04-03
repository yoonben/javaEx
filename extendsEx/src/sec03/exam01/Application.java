package sec03.exam01;

public class Application {

	public static void main(String[] args) {
		// 추상클래스는
		// 미완성된 메서드를 포함하고 있으므로 생성할 수 없다.
		// Phone pone = new Phone(); 
		
		// 추상클래스를 상속받아 추상메서드를 모두 구현 하면
		// 일반클래스로 생성 할 수 있다.
		SmatPhone sp = new SmatPhone("owner");
		
		// 참조형 변수의 타입으로 사용이 가능하다.
		// -> 다형성을 활용할수 있다.
		Phone phone = new SmatPhone("캔디");
		sp.turnOn();
		sp.internetSearh();
		sp.turOff();
	}

}
