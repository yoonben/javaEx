package board.jungang;

public class BoardMain {

	public static void main(String[] args) {
		// 게시글 생성
		Board board1 =new Board("게시글1", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board2 =new Board("게시글2", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board3 =new Board("게시글3", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board4 =new Board("게시글4", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board5 =new Board("게시글5", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board6 =new Board("게시글6", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board7 =new Board("게시글7", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board8 =new Board("게시글8", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board9 =new Board("게시글9", "너무어려워요", "홍길동", "22=03-22", 10);
		Board board10 =new Board("게시글10", "너무어려워요", "홍길동", "22=03-22", 10);
		
		//배열 생성
		Board[] boardLisr = new Board[10];
		
		boardLisr[0] = board1;
		boardLisr[1] = board2;
		boardLisr[2] = board3;
		boardLisr[3] = board4;
		boardLisr[4] = board5;
		boardLisr[5] = board6;
		boardLisr[6] = board7;
		boardLisr[7] = board8;
		boardLisr[8] = board9;
		boardLisr[9] = board10;
		
		//게시글리스트 생성
	}

}
