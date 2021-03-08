package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8979042624550852984L;
	
	String name;
	transient String title; //null
	
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public String toString() {
		return name + "," + title;
	}
}

// ����ȭ: �ν��Ͻ��� ���¸� �״�� ����(Serialization)�ϰų� �ٽ� �����ϴ� ���
// �ν��Ͻ� ������ �ܺη� ����Ǵ� ��
public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personLee = new Person("Lee", "manager");
		try(FileOutputStream fos = 
				new FileOutputStream("../DoitJava/Chapter15/serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);;
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = 
				new FileInputStream("../DoitJava/Chapter15/serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Object obj = ois.readObject();
			if (obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
