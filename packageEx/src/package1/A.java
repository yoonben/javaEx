package package1;

import package2.C;

public class A {
	
	//기능 정의
	public void name() {
			C c = new C();
			B b = new B();
			c.method1();
	}
}

class B{
	//default일 경우 같은 패키지에서 호출 가능
	B(){
		
	}
}
