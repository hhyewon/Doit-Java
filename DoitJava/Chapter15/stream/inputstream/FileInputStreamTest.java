package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {


	public static void main(String[] args) {
		
		FileReader fis = null;
		int i = 0;
		try {
		fis = new FileReader("../DoitJava/Chapter15/input.txt");
		while( (i = fis.read()) != -1) //Returns:the next byte of data, or -1 if the end of thefile is reached.
		
		System.out.println((char)i);

		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			}catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
