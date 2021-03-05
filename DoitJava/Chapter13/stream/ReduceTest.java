package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		
		//짧은 문자열 출력
		if(s1.getBytes().length <= s2.getBytes().length)
			return s1;
		else return s2; 
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"안녕하세요", "hello", "Good Morning", "반갑습니다"};
		
		//가장 긴 문자열을 찾기 >>(1) 직접 구현 해야 함
		System.out.println(Arrays.stream(greetings).reduce("",(s1, s2)-> {
				if(s1.getBytes().length >= s2.getBytes().length)
					return s1;
				else return s2; }
				));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		
		System.out.println(str);
	}

}
