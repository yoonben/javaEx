package car.common;

import java.net.MulticastSocket;

public class CarMain {
	public static void main(String[] args) {
		
		// 메서드또는 생성자의 위치로 이동하는 방법
		// f3 또는 ctr1 + 클릭
		Car car = new Car();
		System.out.println("car ========================");
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);

		Car car1 = new Car("그랜져");
		System.out.println("\ncar1 ========================");
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		
		Car car2 = new Car("SM5", 200);
		System.out.println("\ncar2 ========================");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		
		Car car3 = new Car("소나타", "블랙");
		System.out.println("\ncar3 ========================");
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		
		Car car4 = new Car("소나타", "블랙", 200);
		System.out.println("\ncar4 ========================");
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		
		
		
	}
}
