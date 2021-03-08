package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i <bs.length; i++) {
			bs[i] = data++;
		}
		try( FileOutputStream fos = new FileOutputStream("../DoitJava/Chapter15/output3.txt")){ //�Ű������� true�� �ϸ� �̾�� ����
			
			fos.write(bs, 2, 10); // bs, offset , �����
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("END");
	}

}
