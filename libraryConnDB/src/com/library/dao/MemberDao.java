package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.library.controller.MemberVo;
import com.library.dao.conn.DBUtill;

public class MemberDao {
	
	
	public MemberVo login(String id, String pw) {
		
		// 매개변수를 ?로 입력
		String sql = "select * from member where id = ? and pw = ?";
		try (Connection conn = DBUtill.getConnecttion();
				PreparedStatement pstmt = conn.prepareStatement(sql);)
		{
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				String adminYN =rs.getString("adminYN");
				
				MemberVo memberVo = new MemberVo(id, "", name, adminYN);
				return memberVo;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// id/pw가 일치하는 사용자를 찾을 수 없음
		return null;
	}
	
	/**
	 * 사용자의 정보를 데이터 베이스에 등록합니다.
	 * @param memberVo
	 * @return
	 */
	public int insertMember(MemberVo memberVo) {
		String sql = "INSERT into member VALUES(? ,? ,? ,?)";
	
		try(Connection conn = DBUtill.getConnecttion();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 데이터 베이스에 등록된 사용자 정보를 삭제합니다.
	 * Statement
	 * 
	 * PreparedStatement
	 * -Statement 클래스보다 기능이 향상된 클래스
	 * -코드의 안정석과 가독성이 높다
	 * -인자 값으로 전달이 가능
	 * -매개변수를 ?로 설정(?dp '' 처리를 하지 않습니다.)
	 * 		setString(index, 값);
	 * 		setInt(index, 값);
	 * 
	 * @param id
	 * @return
	 */
	public int deletMember(String id) {
		String sql = "DELETE from member where id = ?";
		try (Connection conn = DBUtill.getConnecttion();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, id);
			
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		return 0;
	}
}
