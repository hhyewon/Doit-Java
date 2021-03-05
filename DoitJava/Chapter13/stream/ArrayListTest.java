package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class ArrayListTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		
		stream.forEach(s -> System.out.println(s)); //추가된 요소들을 하나씩 출력해라
	
		for(String s: sList) {
			System.out.println(s);
		} //forEach와 값이 동일
		
		
		sList.stream().sorted().forEach(s -> System.out.println(s));
	
	
	
	}

}
