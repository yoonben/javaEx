package sec01.exam04;

public class SupersonicAirplaneExample {

	
	public static void main(String[] args) {
		SupersonicAirplane superSoic =
				new SupersonicAirplane(SupersonicAirplane.NORMAL);
		//이륙합니다
		superSoic.takeOff();
		superSoic.fly();
		
		// **가독성을 높여주기 위해 상수를 사용
		superSoic.flyMode = SupersonicAirplane.SUPERSONIC;
		superSoic.fly();
		
		superSoic.flyMode = SupersonicAirplane.NORMAL;
		superSoic.fly();
		
		//착륙
		superSoic.land(                                                                                                                                                                                                                     );
		
	}

}

