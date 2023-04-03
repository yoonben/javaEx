package package2;

public class C {
	
	//private 외부에서 생성자 접근 제한
	public C() {
		// B b = new B();
	}
	
	public C(int i) {
		this();
	}
	
	public void method1() {
		System.out.println("method1");
		method2();
	}
	
	public void method2() {
		System.out.println("method2");
	}
}
