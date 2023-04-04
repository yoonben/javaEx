package com.chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		FileIO io = new FileIO();
		io.fileCopy();
	}
	/**
	 * 파일 복사하기
	 * 
	 * A_File.java 파일을 읽어서
	 * A_File_copy.java파일을 생성합니다.
	 */
	public void fileIOCopy() {
		long startTime, endTime;
		// 시작 시간
		startTime = System.currentTimeMillis();
		File file = new File("C:\\Users\\user\\git\\javaEx\\IOEx\\src\\com\\chap1\\A_File.java"); 
		// 파일의 존재 여부를 확인후 존재하지 않으면 종료
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		try(FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")) {
			
			// 1바이트씩 읽어 옵니다.
			// -1 EndOfFile
			int value = 0;
			
			int i =0;
			byte[] byteArr = new byte[100];
			// i = 바이트 배열에 읽어온 갯수를 반환합니다.
			while((i = fis.read(byteArr)) != -1) {
				// 일어온 갯수만큼 출력합니다.
				// 마지막 출력시 배열의 갯수를 다 채우지 못하면
				// 이전에 읽어들인 내용이 출력됩니다.
				fos.write(byteArr,0,i);
			
			}
			
//			while((value = fis.read()) != -1) {
//				fos.write(value);
//			}
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		
		
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+(endTime-startTime));
		
	}
	

	/**
	 * 복사하기 - 복사할 파일을 준비
	 * 
	 * FileInputStream 읽어와서
	 * FileOutputStream 저장하기
	 */
	public void fileCopy() {
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		try (FileInputStream fis = 
				new FileInputStream("10_1_예외클래스.pptx");
				FileOutputStream fos = 
						new FileOutputStream("예외클래스_copy.pptx")){
			int value = 0;
			int i =0;
			byte[] byteArr = new byte[1000];
			// i = 바이트 배열에 읽어온 갯수를 반환합니다.
			while((i = fis.read(byteArr)) != -1) {
				// 일어온 갯수만큼 출력합니다.
				// 마지막 출력시 배열의 갯수를 다 채우지 못하면
				// 이전에 읽어들인 내용이 출력됩니다.
				fos.write(byteArr,0,i);
			
			}
			
			
//			while((value = fis.read()) != -1) {
//				fos.write(value);
//			}
			// 저장
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+(endTime-startTime));
		
	}
}

