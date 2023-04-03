package arratEx;

import java.util.Iterator;
import java.util.Scanner;

public class ArryaEx06 {

	public static void main(String[] args) {
		// 2차운 배열
		// 마치 행과 열로 구성된 배열
		// 타입[][] scores - 탕엡[행]]열{}
		int[][] scores = new int[3][3];
		
		
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6};
		
		System.out.println("scores.length: "+scores.length);
		System.out.println("scores[0]: "+scores[0]);
		System.out.println("scores[1]: "+scores[1]);
		
		System.out.println("scores[0][0]: "+scores[0][0]);
		
		for(int i = 0; i<scores.length; i++) {
			int[] points = scores[i];
			for(int j=0; j<points.length;j++) {
				System.out.printf("(%d,%d0)=%d",i,j ,points[i]);
			}
			System.out.println();
		}
	}

}
