package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public class DatabaswDao implements Dao{

	@Override
	public List<Book> getBookList() {
		System.out.println("DB-리스트 조회");
		return null;
	}

	@Override
	public int insertBook(List<Book> list) {
		System.out.println("DB-도서 정보 입력");
		return 0;
	}

	@Override
	public int deleteBook(List<Book> list) {
		System.out.println("DB-도서 삭제");
		return 0;
	}




	@Override
	public int updatBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}
