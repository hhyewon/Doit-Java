package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1","조정래");
		bookArray1[1] = new Book("태백산맥2","조정래");
		bookArray1[2] = new Book("태백산맥3","조정래");
	
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		String[] strArr = {"JAVA", "ANDROID", "C"};
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		// ==
		for(String s: strArr) {
			System.out.println(s);
		}
		
		//int에서도 사용한다.
		int[] arr = {1,2,3,5,6};
		for(int num: arr) {
			System.out.println(num);
		}
		
	}
}
