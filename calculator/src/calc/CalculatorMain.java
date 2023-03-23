package calc;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// 매개변수의 타입과 갯수가 일치하지 않을때
		// 에러가 발생한다.
		calc.powerOn();
		int res =calc.add(5, 5);
		
		System.out.println(res);
		int[] numbers = {1,2,3,4,5};
		System.out.println("calc.add(numbers): "+calc.add(numbers));
		//메서드를 실행 할때 배열을 생성
		calc.add(new int[] {1,2,3});
		System.out.println("calc.add(new int[] {1,2,3}): "+calc.add(new int[] {1,2,3}));
		System.out.println("calc.addFn: "+calc.addFn(1,2,3,4,5,6));
	}

}
