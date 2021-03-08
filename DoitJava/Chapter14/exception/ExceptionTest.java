package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	/*
	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close(); //입출력을 열면 닫아줘야됨
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("finally");
		}
		System.out.println("end");
	}
	/*
	java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
	Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.io.FileInputStream.close()" because "fis" is null
		at exception.ExceptionTest.main(ExceptionTest.java:19)
	*/
	public static void main(String[] args) {
	
		try (FileInputStream fis = new FileInputStream("../DoitJava/Chapter14/a.txt")){
		
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
	}
	
	
