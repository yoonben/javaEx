package sec03.exam01;

public class SmatPhone extends Phone{

	public SmatPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	// 추상메서드를 구현 해야지만 일반 클래스가 될수 있다.
	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
		
	}
	
	
	public void internetSearh() {
		System.out.println("인터넷을 검색합니다.");
	}

	// 상속받은 추상메서드를 모두 구현햐야 일반 클래스가 될수 있다.
	// 부모로부터 강제로 구현을 위임받는다.
	@Override
	public void turOff() {
		
	}
}
