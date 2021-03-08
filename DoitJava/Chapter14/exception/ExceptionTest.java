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
				fis.close(); //������� ���� �ݾ���ߵ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("finally");
		}
		System.out.println("end");
	}
	/*
	java.io.FileNotFoundException: a.txt (������ ������ ã�� �� �����ϴ�)
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
	
	
