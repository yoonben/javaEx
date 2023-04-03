package sec01.exam02;

import sec01.exam01.Audio;

public class Application {

	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체를 생성후
		// 참조차입 변수에 저장
		MyClass myclass = new MyClass();
		// 1. 인터페이스가 필드에 사용된 경우
		// 1_1. MyClass의 필드에 접근하여 메서드를 호출(smartTv생성되어 있음)
		myclass.rc.turOn();
		myclass.rc.setVolume(15);
		myclass.rc.turOff();
		
		System.out.println("*********************************");
		
		// 1_2. 필드에 새로운 객체를 생성하여 저장
		myclass.rc = new Audio();
		myclass.rc.turOn();
		myclass.rc.setVolume(0);
		myclass.rc.turOff();
		
		System.out.println("*********************************");
		
		// 2. 인터페이스가 생성자의 매개변수로 이용된 경우
		MyClass myclass1 = new MyClass(new Audio());
		myclass1.rc.turOn();
		myclass1.rc.setVolume(5);
		myclass1.rc.turOff();
		
		System.out.println("*********************************");
		
		// 3. 인터페이스가 메서드의 매개변수로 이용된 경우
		// 기본생서자로 생성하면 rc = new SmartTV();
		// 필드의 선언부에서 생성하고 있습니다.
		MyClass myclass2 = new MyClass();
		myclass2.methodB(new Audio());
		
		// 인터페이스가 메서드의 매개변수 타입으로 사용될 경우
		// 메서드 호출시 구현 객체를 매개값으로 대입한다.
		myclass2.rc.turOn();
		myclass2.rc.setVolume(5);
		myclass2.rc.turOff();
		System.out.println("*********************************");
		
//		MyClass myclass3 =new MyClass();
//		
//		myclass3= MetodhA();
		// 4. 메서드에 선언된 로컬변수를 rc에 저장
//		myclass3.rc;
//		myclass3
//		myclass3
//		myclass3
	}

}
