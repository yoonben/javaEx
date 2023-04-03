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
	public int insertBook(Book book) {
		System.out.println("DB-도서 정보 입력");
		return 0;
	}

	@Override
	public int deleteBook(Book book) {
		System.out.println("DB-도서 삭제");
		return 0;
	}

	@Override
	public int updateBook(Book book) {
		System.out.println("DB-정보 업데이트");
		return 0;
	}

}
