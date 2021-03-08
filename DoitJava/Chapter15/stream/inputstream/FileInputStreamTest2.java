package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		try( FileInputStream fis = new FileInputStream("../DoitJava/Chapter15/input2.txt")){
			byte[] bs = new byte[10]; //10°³¾¿
			int i;
			while( (i = fis.read(bs)) != -1) {
				for (int j=0; j<i; j++) { 
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
