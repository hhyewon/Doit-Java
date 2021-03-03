package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree); //[aaa, bbb, ccc]
		//정렬이 되는 이유: compare라는 메서드가 이미 구성되어 있어서
		//
	}

}
