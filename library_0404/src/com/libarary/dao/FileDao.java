package com.libarary.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.libarary.vo.Book;

public class FileDao implements Dao{
	
	@Override
	public List<Book> getList() {
		System.out.println("FileDao.getList() 시작");
		List<Book> list = new ArrayList<>();
		
		/**
		 * 파일을 읽어서 리스트를 반환
		 */
		// 반납할 자원이 있는 경우 try () 안에서 생성할 경우 자동으로 close 해줍니다.
		try (FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr); ){
			String str = "";
			// 파일로 부터 한줄을 읽어들여 널이 될떄까지 반복합니다.
			// null = 파일의 끝
			while((str = br.readLine()) != null) {
				Book book = makebook(str);
				// 리스트 파싱중 오류가 발생한 것은 제외
				if(book!=null) {
					list.add(book);
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
			e1.printStackTrace();
		}
	
		
		return list;
	}
	
	/** 
	 * 문자열을 받아서 책을 생성하여 반환 합니다.
	 * @param str
	 * @return
	 */
	// 접근제한자 반환타입 이름 (매개변수)
	public Book makebook (String str) {
		// book를 선언 합니다. ==> 반환용
		Book book = null;
		try {
			
			// 0 책1 저자1 false
			// 공백을 이용해서 문자열을 잘라 배열로 반환
			String[] strArry = str.split(" ");
			
			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author = strArry[2];
			boolean isRent = Boolean.parseBoolean(strArry[3]);
			
			book = new Book(no, title, author, isRent);
			
		} catch (Exception e) {
			// 데이터 파싱중 오류가 발생 하더라도 프로그램이 종료되지 않도록
			// try구분을 활용하여 오류를 처리
			System.err.println("리스트 생성중 오류가 발생하였습니다.");
			System.err.println("==========="+str);
		}
		
		// 책이 정상적으로 생성된 경우 Book을 반환
		// 생성중 오류가 발생시 null을 반환
		return book;
	
	}

	@Override
	public Boolean saveFile(List<Book> list) {
		// 리스트를 파일로 저장 합니다.
		try (FileWriter fw = new FileWriter("bookList.txt");){
			
			for(Book book : list) {
				// 팩의 정보를 공뱍으로 연결하여 반환
				fw.write(book.toString()+"\n");
			}
			// 파일로 출력 합니다.
			fw.flush();
			// 파일 출력 성공
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일 출력 실패
		return null;
	}
	
}
