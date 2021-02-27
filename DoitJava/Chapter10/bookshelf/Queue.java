package bookshelf;

public interface Queue {

	void enQueue(String title); //집어 넣음 ( 맨 뒤로 )
	
	String deQueue(); //책 제목 반환
	int getSize();
}
