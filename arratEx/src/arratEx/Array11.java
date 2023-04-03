package arratEx;

public class Array11 {

	public static void main(String[] args) {
		String[] oldStrArr = {"java", "array", "copy"};
		String[] newStrArr = new String[5];	
	
		// (원본배열, 복사시작index, 새로운배열, 
	   //   새배열에 복사를 시작할 인데스, 복사할 갯수)
		// java 기본 API에서 제공해주는 메서드를 활용해서 배열을 복사
		System.arraycopy(oldStrArr, 0, newStrArr,1, oldStrArr.length);
		for(int i =0; i<newStrArr.length;i++) {
			System.out.println(newStrArr[i]);
		}
		// 향상된 for문을 이용하는 방법
		// (타입 변수명 : 배열의 이름)
		// 매열의 요소를 모두 순회합니다 .0 < 배열명.lenght
		// 배열이름[인덱스]
		for(String data : newStrArr ) {
			System.out.println(data);
		}
}
}