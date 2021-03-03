package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

import collection.Member;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*(-1); //내림차순
	}
	
	
}

public class ComparatorTest {

	public static void main(String[] args) {

		// TreeSet<String> tree = new TreeSet(); //이러면 오름차순 이지만
		
		TreeSet<String> tree = new TreeSet(new MyCompare()); //이러면 위에 compare를 참고해서 내림차순이 된다.
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree);
	}

}
