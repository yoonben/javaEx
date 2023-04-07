package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDao {
	public static void main(String[] args) {
		
		BookDao dao = new BookDao();		
		//dao.insert(8, "해리포터","j롤릴","N");
		//dao.delet(7);
		//dao.update(7);
		List<Book> list = dao.getList();
		
		System.out.println("책 리스트 ================");
		for(Book book : list) {
			book.toString();
		}
		}
	// 데이터 삽입
	public void insert(int no, String title, String author, String isRent) {
		try {
			
			Connection conn=DBUtill.getConnection();
			Statement stmt =conn.createStatement();
			
			String sql = "insert into book values ("+no+", '"+title+"', '"+author+"','"+isRent+"',SYSDATE,NULL)";
			// 삽입/수정/삭제
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res+"건이 처리되었습니다.");
			// 자원 반납
			DBUtill.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 데이터 수정
	public void update(int no) {
		try {
			
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "UPDATE BOOK set isrent = 'Y' WHERE NO = "+no;
			
			// 삽입/수정/삭제
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res+"건이 수정 되었습니다.");
			
			System.out.println("대기");
			Thread.sleep(5000);
			// 자원 반납
			DBUtill.closeConnection(conn, stmt);
			System.out.println("자원반납");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	// 데이터 삭제
	public void delet(int no) {
		try {
			
			Connection conn=DBUtill.getConnection();
			Statement stmt =conn.createStatement();
			
			String sql = "DELETE from book where NO = "+no;
			// 삽입/수정/삭제
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res+"건이 처리되었습니다.");
			// 자원 반납
			DBUtill.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 데이터 조회
	public List<Book> getList(){
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			// 질의결과를 결과집합으로 받아 옵니다.
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editDate = rs.getDate(6);
				
				Book book = new Book(no, title, author, isRent, regdate, editDate);
				
				list.add(book);
			}
			
			DBUtill.closeConnection(conn, stmt, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
