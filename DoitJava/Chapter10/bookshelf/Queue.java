package bookshelf;

public interface Queue {

	void enQueue(String title); //���� ���� ( �� �ڷ� )
	
	String deQueue(); //å ���� ��ȯ
	int getSize();
}
