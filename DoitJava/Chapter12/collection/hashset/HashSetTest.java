package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		
		System.out.println(b1); //true
		//set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set); //������� ������ ����
		
		boolean b=set.add("aaa");
		
		System.out.println(b); //false //���� element�� �ȵ���.
		System.out.println(set);
	}

}
