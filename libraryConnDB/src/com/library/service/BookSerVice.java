package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

/**
 * 비즈니스로직
 * 
 * 사용자요청검증
 * DB CRUD 요청
 * 사용자 요구에 맞게 반환
 * 
 * Dao 호출
 * @author user
 *
 */

public class BookSerVice {
	
	
	BookDao bookDao = new BookDao();
	
	public void getList() {
		List<BookVo> list = bookDao.getList();
		
		for(BookVo book : list) {
			System.out.println(book.toString());
		}
		
	}

	public int insertBook(BookVo bookVo) {
		int res = bookDao.insertBook(bookVo);
		if(res >0) {
			System.out.println("입력되었습니다.");
			getList();
		} else {
			System.out.println("입력중 오류가 발생했습니다.");
		}
		return 0;
	}

	public int deletBook(int bookNo) {
		int res = bookDao.deletBook(bookNo);
		if(res >0) {
			System.out.println("삭제되었습니다.");
			getList();
		} else {
			System.out.println("삭제중 오류가 발생했습니다.");
		}
		return 0;
	}
	/**
	 * 책이 렌트 가능한 상태인지 확인
	 * 가능한 상태면 대여 처리
	 * 아니면 메서지 처리
	 * @param bookNo
	 */
	public void rentBook(int bookNo) {
		// 대여 가능 여부를 판단
		boolean flg = selStatus(bookNo, "N");
		if(flg) {
			int res = bookDao.updateBook(bookNo, "Y");
			if(res>0) {
				System.out.println("대여가 되었습니다.");
				getList();
			}else {
				System.err.println("대여중 문제가 발생 하였습니다.");
			}
		} else {
			System.err.println("대여가 불가능한 상태 입니다.");
		}
	}
	
	/**
	 * 대여/반납이 가능한 책인지 조회 합니다. 
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no , String rentYN) {
		boolean res = bookDao.selStatus(no, rentYN);
		return res;
	}

	public void returnBook(int bookNo) {
		boolean flg = bookDao.selStatus(bookNo, "Y");
		if(flg) {
			int res = bookDao.updateBook(bookNo, "N");
			if(res >0) {
				System.out.println("반납 되었습니다.");
				getList();
			}else {
				System.out.println("반납 중 오류가 발생하였습니다.");
			}
		}else {
			System.out.println("반납 가능한 상태가 아닙니다.");
		}
	}
}
