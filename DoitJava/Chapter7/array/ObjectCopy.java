package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���1","������");
		bookArray1[1] = new Book("�¹���2","������");
		bookArray1[2] = new Book("�¹���3","������");
	
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
		
		//int������ ����Ѵ�.
		int[] arr = {1,2,3,5,6};
		for(int num: arr) {
			System.out.println(num);
		}
		
	}
}
