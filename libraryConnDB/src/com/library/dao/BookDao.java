package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.conn.DBUtill;
import com.library.vo.BookVo;
/**
 * DB입출력
 * @author user
 *
 */
public class BookDao {
	
	public List<BookVo> getList(){
		List<BookVo> list = new ArrayList<>();
		String sql = "select * from book order by bookNo";
		try (Connection conn = DBUtill.getConnecttion();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			
			while(rs.next()){
				int book = rs.getInt("bookNo");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String rentYN = rs.getString("rentYN");
				// 책을 생성하여 리스트에 담아줍니다.
				BookVo bookVo = new BookVo(book, title, author, rentYN);
				list.add(bookVo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public int insertBook(BookVo bookVo) {
		String sql = "INSERT into BOOK VALUES(?, ?, ?, ?)";
		try (Connection conn = DBUtill.getConnecttion();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, bookVo.getBookNo());
			pstmt.setString(2, bookVo.getTitle());
			pstmt.setString(3, bookVo.getAuthor());
			pstmt.setString(4, bookVo.getRentYN());
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int deletBook(int bookNo) {
		String sql = "DELETE from book where bookNO = ?";
		try (Connection conn = DBUtill.getConnecttion();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setInt(1, bookNo);
			
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		return 0;
	}
	/**
	 * 대여/반납이 가능한 상태라면 true
	 * 아니면 false
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		String sql = "select * from book where bookno =? and rentyn=?";
		try (Connection conn = DBUtill.getConnecttion();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, no);
			pstmt.setString(2, rentYN);
			ResultSet rs = pstmt.executeQuery();
			
			return rs.next();
			
		} catch (SQLException e) {
			System.err.println("반환중 에러가 발생하였습니다.");
			e.printStackTrace();
		}
		return false;
	}

	public int updateBook(int bookNo, String rentYN) {
		String sql = "update book set rentyn = ? where bookNo = ?";
		try (Connection conn = DBUtill.getConnecttion();
				PreparedStatement pstmt= conn.prepareStatement(sql);){
			// ?의 순서대로 인덱스 번호를 부여합니다.			
			pstmt.setString(1, rentYN);
			pstmt.setInt(2, bookNo);
			
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return 0;
	}
}
