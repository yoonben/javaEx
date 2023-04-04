package com.chap2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 보조스티림
 * 	- 기반 스트림(Input/OutputStream, Reader/Writer)과 연결되
 * 		여러가지 편리한 기능을 제공해주는 스트림을 말한다.
 * 	- 단독으로 외부 매체(파일, 네트워크, 키보트, 모니터 등)와
 * 		데이터를 작접 주고 받을 수 없다.
 * 
 * 성능 향상 보조 스트림
 * 	- 기반 스트림의 속도를 향상시켜주는 기능을 한다.
 * 	- 기반스트림에 대한 레퍼런스각 필요하다.
 * 	- 버퍼라는 공간을 사용해서 속도 향상에 도움을 준다.
 * 		(버퍼라는 공간에 데이터를 쌍아 놨다가 한 번에 입.출력 시킨다.)
 * 	- 기반 스트림에서 제공하지 않는
 * 		메소드(newLine(), readLine())을 제공한다
 */
public class A_BufferedStream {
	public static void main(String[] args) {
		A_BufferedStream bufferedStreamEx = new A_BufferedStream();
		bufferedStreamEx.fileRead();
	}
	
	public void fileRead() {
		// 보조스트림은 단독으로 사용 불가
		// 기반스트림을 생성자의 매개변수로 넣어주어야 한다.
		try (BufferedReader br
				= new BufferedReader(new FileReader("c_buffer.txt"));){
			String str = "";
			
			// 기반 스트림에서 제공하지 않는 메서드
			// 파일에서 한 줄을 읽어올때 사용한다.
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	
	}
	
	public void fileSave() {
		// true : 이어서 작성
		// false : 덮어쓰기	<== 기본값
		try (FileWriter fw = new FileWriter("c_buffer.txt", true);
				// 매개변수로 기반 스트림을 넣어줍니다.
				BufferedWriter bw = new BufferedWriter(fw)){
			
			bw.write("안녕하세요~~~");
			bw.newLine();
			bw.write("대답을 잘해주세요");
			
			bw.flush();
			
	// 매개변수에 바로 생성도 가능
	//BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
