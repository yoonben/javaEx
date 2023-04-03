package sec01.exam04;

// final 키워드 부모클래스가 될수 없음
public class Airplane {
	
public Airplane() {
	System.out.println("===============Airplane 생성");
}

public void land() {
	System.out.println("착륙합니다.");
}

// final 키워드 :메서드를 재정의 할수 없다.
// public final void fly(){
public void fly() {
	System.out.println("일반비행 입니다.");
}

public void takeOff() {
	System.out.println("이륙합니다.");
}

}
