package com.libarary.dao;

import java.util.List;

import com.libarary.vo.Book;

public interface Dao {
	// 파일로 부터 데이터를 읽어서 리스트에 담아 반환합니다.
	List<Book> getList();
	Boolean saveFile(List<Book> list);
}
