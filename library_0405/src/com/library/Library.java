package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	// 책 목록
	// 필드로 선언시 클래스 내부에서 자유롭게 이용이 가능하다
	// 전역변수
	List<Book> list = null;
	// 인터페이스를 타입으로 선언 -> 인터페이스의 구현체를 이용해 생성
	Dao dao = new FileDao();
	
	
	
	// 생성자 : 클래스명과 같은 이름, 반환 타입이 없다.
	Library() {
		// 리스트 초기화
		list = dao.getList();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		System.out.println("책 목록 ==================== lib.toString");
		String info = "";
		for(Book book:list) {
			info += book.info()+"\n";
		}
		return info;
	}
	
	// 1.책의 정보를 받아서 리스트에 등록후
	// 2.리스트를 파일로 출력
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		// 중복된 일련번호 검사
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("중복된 일련번호가 존재합니다.\n확인후 다시 입력해주세요");
				return false;
			}
		}
		
		// 1. 책을 생성
		Book book = new Book(no, title, author, isRent);
		
		// 2. 리스트에 등록
		list.add(book);
		
		// 3.리스트를 파일로 출력
		boolean res = dao.ListToFile(list);
		
		// 4. 파일에 정상적으로 등록이 되지 않는 경우
		// 	  리스트에서 제거
		if(!res) {
			list.remove(book);
			System.out.println("책이 등록되지 않았습니다. \n 관리자에게 문의 해주세요");
			return false;
		}
		System.out.println("책이 등록 되었습니다.");
		System.out.println(toString());
		return true;
	}

	/**
	 * 책의 일련번호를 입력 받아서 리스트에서 삭제 합니다.
	 * 리스트를 파일로 출력합니다.
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				// 삭제
				list.remove(book);
				// 리스트를 파일로 출력
				boolean res = dao.ListToFile(list);
				if(!res) {
					// 파일로 출력이 실패할 경우 책을 다시 리스트에 추가합니다.
					list.add(book);
					System.err.println("파일 출력도중 오류가 발생 하였습니다.\n Library.deleteBook()");
					return false;
				}
				System.out.println("책을 삭제하였습니다. ");
				System.out.println(toString());
				return true;
			}
		}
		System.err.println("존재하는 일련번호가 없습니다.\n 일련번호를 확인해주세요.");
		return false;
	}

	/**
	 * 일련번호에 해당하는 책을 찾는다.
	 * 책의 상태가 렌트가 가능한 상태 (isRent = false)라면 렌트(isRent = true)
	 * 렌트가 가능한 상태가 아니라면 메세지 처리
	 * 리스트를 파일로 출력
	 * @param no
	 * @return
	 */
	public boolean rentBook(int no) {
		for(Book book : list) {
			// 일련번호에 해당하는 책을 찾는다
			if(book.getNo() == no) {
				if(book.isRent() == false) {
					// 렌트 상태로 변경
					book.setRent(true); 
					// 파일로 출력
					boolean res = dao.ListToFile(list);
					if(!res) {
						book.setRent(false);
						System.err.println("파일로 출력 하는 데 실패 했습니다.");
						return false;
					}
					System.out.println("책을 대여하셨습니다.");
					System.out.println(toString());
					return true;
				}else if(book.isRent() == true) {
					System.err.println("대여가능한 도서가 아닙니다.");
					return false;
				}
			}
		}
		System.err.println("일련번호에 해당하는 책이 존재하지 않습니다.");
		return false;
	}

	/**
	 * 일련번호에 해당하는 책을 찾는다.
	 * 도서가 대여중이라면 반납처리
	 * 아니면 (반납가능한 도서가 아닙니다)메세지 처리
	 * @param no
	 * @return
	 */
	public boolean returBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent() == true) {
					// 반납처리
					book.setRent(false); 
					boolean res = dao.ListToFile(list);
					if(!res) {
						book.setRent(false);
						System.err.println("파일로 출력 하는 데 실패 했습니다.");
						return false;
					}
					System.out.println("책을 반납하셨습니다.");
					
					return true;
				}else if(book.isRent() == false) {
					System.err.println("반납가능한 도서가 아닙니다.");
					return false;
				}
			}
		}
		System.err.println("일련번호에 해당하는 책이 존재하지 않습니다.");
		return false;
	}
	 
	
}
