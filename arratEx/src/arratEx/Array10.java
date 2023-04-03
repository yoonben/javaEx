package arratEx;

public class Array10 {

	public static void main(String[] args) {
		//  배열의 길이를 변경할 수 없으므로
		//  배열이 길이를 늘리거나 줄이기 위해서는 새로운 배열을 만든고 기존 배열을 복사한다.
		
		// int 타입 배열을 선언
		// 배열의 값목록 : {1,2,3}
		int[] oldArr = {1,2,3};
		int[] newArr = {0,0,0,0,0};
		
		for(int i =0;i<oldArr.length;i++) {
			newArr[i] = oldArr[i];
			System.out.println("oldarr "+i+" : "+oldArr[i]);
		}
	}

}
