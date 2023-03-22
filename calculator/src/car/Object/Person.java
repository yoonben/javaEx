package car.Object;

public class Person {

	public static void main(String[] args) {
		
		
		Car car = new Car();
		Car carGia = new Car("기아자동차");
		
		//필드에 접근하기 위해서는 객체가 생성되어 있어야 한다.
		System.out.println("car.company :"+ car.company);
		car.speedup();
		System.err.println("car.speed: "+car.speed);
		
		System.err.println("cargia.company : "+carGia.company);
	}

}
