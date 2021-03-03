package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

import collection.Member;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*(-1); //��������
	}
	
	
}

public class ComparatorTest {

	public static void main(String[] args) {

		// TreeSet<String> tree = new TreeSet(); //�̷��� �������� ������
		
		TreeSet<String> tree = new TreeSet(new MyCompare()); //�̷��� ���� compare�� �����ؼ� ���������� �ȴ�.
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree);
	}

}
