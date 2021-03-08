package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long milliseconds = 0;
		int len = 0;
		try( FileInputStream fis = 
				new FileInputStream("../DoitJava/Chapter15/a.exe");
				FileOutputStream fos =
						new FileOutputStream("../DoitJava/Chapter15/b.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)
						){
			
			milliseconds = System.currentTimeMillis();
			int i;
			
			while ( ( i = fis.read() )!= -1) {
				fos.write(i);
				len++;
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(milliseconds);
	}

}
