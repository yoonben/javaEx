package korean.object;

public class KoreanMain {
	public static void main(String[] args) {

		Korean korea = new Korean();
		korea.name = "전지현";
		korea.ssn = "222222-222222";
		System.out.println(" korean============");
		System.out.println(korea.name);
		System.out.println(korea.ssn);
		System.out.println(korea.nation);

		Korean hong = new Korean("홍길동", "12456-1234567");
		System.out.println(" 홍길동============");
		System.out.println(hong.name);
		System.out.println(hong.ssn);
		System.out.println(hong.nation);

		Korean lee = new Korean("이하늬", "111111-222222");
		System.out.println(" 이하늬============");
		System.out.println(lee.name);
		System.out.println(lee.ssn);
		System.out.println(lee.nation);

	}
}
