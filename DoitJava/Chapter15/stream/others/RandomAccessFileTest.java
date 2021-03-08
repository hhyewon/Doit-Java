package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = 
				new RandomAccessFile("../DoitJava/Chapter15/random.txt", "rw");
		
		rf.writeInt(100); //4byte
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14); //8
		System.out.println(rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println(rf.getFilePointer());
		
		rf.seek(0); //파일 포인터 맨 앞으로 이동 
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
