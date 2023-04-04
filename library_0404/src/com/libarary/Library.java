package com.libarary;

import java.io.BufferedReader;
import java.util.List;

import com.libarary.dao.Dao;
import com.libarary.dao.DatabaseDao;
import com.libarary.dao.FileDao;
import com.libarary.vo.Book;

public class Library {
	
	//필드 (전역변수)
	// 클래스 내부 에서 어디서든지 사용할수 있다
	private List<Book> list;
	// FileDao 또는 DatabaseDao 로 생성 할 수 있도록
	// 인터페이스를 타입으로 선언
	private Dao dao = new FileDao();

	public Library() {
		// 파일을 읽어서 리스트를 초기화 합니다.
		list = dao.getList();
	}
	
	public boolean insert(int no, String title
								, String athor, boolean isRent) {
		// 중복된 일련번호 검사
		for(Book book : list) {
			if(book.getNo() == no) {
				System.out.println("중복된 일련번호가 존재합니다.");
				return false;
			}
		}
		// 외부로 부터 받은 데이터를 바탕으로 책을 생성하고 리스트에 추가
		Book book = new Book(no, title, athor, isRent);
		// 리스트를 파일에 저장
		list.add(book);
		boolean res = dao.saveFile(list);
		if(res) {
			// 파일에 성공적으로 저장되면 리스트에 추가
			return true;
		}else {
			list.remove(book);
			return false;
		}
	}
	
	@Override
	public String toString() {
		String listStr = "";
		for(Book book:list) {
			listStr += book.toString() +"\n";
		}
		
		return listStr;
	}
	
	public Library(String type) {
		if(type.equalsIgnoreCase("DB")) {
			dao = new DatabaseDao();
		}
	}
}
