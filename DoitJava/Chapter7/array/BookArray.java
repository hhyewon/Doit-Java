package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		//��ü�� ���� �������ؼ� �迭�� �־���� �Ѵ�.
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0]= new Book("å �̸�", "�۰�");
		library[1]= new Book("å �̸�", "�۰�");
		library[2]= new Book("å �̸�", "�۰�");
		library[3]= new Book("å �̸�", "�۰�");
		library[4]= new Book("å �̸�", "�۰�");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
	}

}
