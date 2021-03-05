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
	//	System.out.println(count); //에러가남
		//>> 한 번 사용된 스트림은 사용된 후 소모가 되기 때문(재사용 불가)
		// >> 스트림을 다시 생성해야 한다.
		
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		
	}

}
