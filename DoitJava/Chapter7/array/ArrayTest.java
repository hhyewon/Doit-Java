package array;

public class ArrayTest {

	public static void main(String[] args) {

//		int[] num = new int[] { 0, 1, 2 }; // �迭 �ʱ�ȭ
		//�ʱ�ȭ�Ǵ� �����͸�ŭ �޸𸮰� ������.
		// System.out.println(num.length);
		
		int[] num = new int[3];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		for(int i = 0 ; i <num.length; i++) {
			System.out.println(num[i]);
			
		}
		
		
	}

}
