package sec01.exam05;

// inplements 구현하겠다
// Vehicle vehicle 인터페이스를 
// 나는 인터페이스로 자동 형 변환이 가능하다.
public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 첵크합니다.");
	}
}
