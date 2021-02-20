package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		//객체를 각각 생성을해서 배열에 넣어줘야 한다.
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0]= new Book("책 이름", "작가");
		library[1]= new Book("책 이름", "작가");
		library[2]= new Book("책 이름", "작가");
		library[3]= new Book("책 이름", "작가");
		library[4]= new Book("책 이름", "작가");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
	}

}
