package sec01.exam01;

public class Application {

	public static void main(String[] args) {
		// 인터페이스는 생성할 수 없지만
		// 참조 변수의 타입으로 사용할 수 있다
		// 인터페이스 변수 = new 구현객체;
		
		// 인터페이스의 다향성
		// 인터페이스의 구현체는 인테페이스를 가질 수 있다.
		RemoteControl rc = new Audio();
		
		rc.turOn();
		rc.setVolume(8);
		rc.turOff();
		
		// 상속 단계에 있는 부모가 인터페이스를 구현하고 있는 경우
		// 인터페이스의 타입으로 생성이 가능하다
		RemoteControl smartTv = new SmartTv();
		
		smartTv.turOn();
		smartTv.setVolume(6);
		smartTv.turOff();
		
		Searchable seachable = new SmartTv();
		Television tv = new SmartTv();
		
		seachable.search("고양이");
		
//		RemoteControl tv = new Television();
//		
//		tv.turOn();
//		tv.setVolume(6);
//		tv.turOff();
	}

}
