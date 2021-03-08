package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try(InputStreamReader fis = new InputStreamReader(
				new FileInputStream("../DoitJava/Chapter15/reader.txt"))){
			
			int i = 0;
			while(( i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e){
				System.out.println(e);
		}
		Socket socket = new Socket();
		
		}
	}

