package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		IntStream stream =Arrays.stream(arr);
		int sum= Arrays.stream(arr).sum();
		System.out.println(sum);

	//	int count = (int)stream.count();
	//	System.out.println(count); //��������
		//>> �� �� ���� ��Ʈ���� ���� �� �Ҹ� �Ǳ� ����(���� �Ұ�)
		// >> ��Ʈ���� �ٽ� �����ؾ� �Ѵ�.
		
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		
	}

}