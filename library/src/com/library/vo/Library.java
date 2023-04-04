package com.library.vo;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaswDao;
import com.library.dao.FileDao;

public class Library {
	
	// 도서 리스트 - 메모리(프로그램 종료시 사라짐)
	private List<Book> bookList = new ArrayList<>();
	
	// data access object
	private Dao dao = null;
	
	/**
	 * 생성자
	 * 
	 */
	public Library(String confdao) {
		if("db".equals(confdao)) {
			dao= new DatabaswDao();
		}else {
			dao = new FileDao();
		}
		// 책의 리스트를 조회 (파일또는 DB를 이용해서 조회)
		// 책을 생성해서 리스트에 담아 줄께요!
		
		// TODO : 일련번호가 겹치지 않았으면 좋겠다!
		// 데이터베이스를 이용할 경우 번호를 기본키로 사용시
		// 중복된 번호는 입력이 안되므로 오류 발생
		bookList.add(new Book(1,"책1","작가1",false));
		bookList.add(new Book(2,"책2","작가2",false));
		bookList.add(new Book(3,"책3","작가3",false));
		bookList.add(new Book(4,"책4","작가4",false));
	}
	
	/**
	 * 신규도서 추가
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	public boolean insertBook(int no ,String title, String author, boolean isRent){
		// 리스트에 책을 추가합니다,
		Book book = new Book(no, title, author, isRent);
		bookList.add(book);
		dao.insertBook(bookList);
		return true;
	}
	
	/**
	 * 책 삭제 하기
	 * @param index
	 * @return
	 */
	public boolean deletBook(int index) {
		// 책의 일렬번호를 확인
		for(Book book : bookList) {
			if(index == book.getNo()) {
				dao.deleteBook(bookList);
			return bookList.remove(book);
			}
		}
		System.err.println("일렬번호를 찾을수가 없습니다.");
		return false;
	}
	// 책 반납하기
	public boolean returnBooK(int index) {
		for(Book book : bookList) {
			if(book.getNo() == index) {
				// 도서가 대여가능 상태인 경우
				if(!book.isRent()) {
					System.err.println("반납 가능한 도서가 아닙니다.");
					return false;
				}
				// 대여여부 변경 = 책의 정보를 수정
				book.setRent(false);
				dao.updatBook(bookList);
				return true;
			}
		}
		System.err.println("일렬번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	/**
	 * 책 대여
	 * 책의 일련번호를 매개변수로 받아서 isRent값을 수정 합니다.
	 * @param index
	 * @return
	 */
	public boolean rentBook(int index) {
		for(Book book : bookList) {
			// 사용가 입력한 일렬번호가 존재하는 경우
			if(book.getNo() == index) {
				// 이미 대여중인 경우
				if(book.isRent()) {
					System.err.println("이미 대여중인 도서 입니다.");
					return false;
				}
				book.setRent(true);
				dao.updatBook(bookList);
				return true;
			}
		}
		System.err.println("일렬번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	// 리스트 정보를 출력
	public void info() {
		// 리스트를 돌면서
		System.out.println("도서 정보=================");
		for(Book book : bookList) {
			// 책의 정보를 출력
			book.info();
		}
	}
	
	public static void main(String[] args) {
		// 라이브러리 생성
		Library lib = new Library("");
		
		// 신규 도서 등록
		//lib.insertBook(5, "책5", "저자5", false);
		System.out.println("도서 삭제 실행 lib.deletBook(1) ==========================");
		lib.deletBook(1);
		
		System.out.println("도서 대여 실행 lib.rentBook(2)  ==========================");
		// 도서대여후 출력
		lib.rentBook(2);
		lib.info();
		
		System.out.println("도서 반납 실행 lib.returnBooK(2) ==========================");
		// 도선반납후 출력
		lib.returnBooK(2);
		lib.info();
	}
}
