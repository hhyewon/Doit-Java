package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStream {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("../DoitJava/Chapter15/data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.write(100); 
			dos.writeInt(10);
			dos.writeChar('A');
			dos.writeUTF("hello");
		}catch(IOException e) {
		}
		
		try( FileInputStream fis = new FileInputStream("../DoitJava/Chapter15/data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		}catch(IOException e) {
			
		}
	}

}
