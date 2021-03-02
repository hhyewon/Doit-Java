package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
//쓰려는 객체에 대해 equals와 hashcode를 구현해야 한다.
	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		
		Member memberLee = new Member(101,"이순신");
		Member memberKim = new Member(102,"김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
		
		
		//같은 ID값이 들어가면 안되는데 같은 값이 들어가졌다.
		//앞선 aaa테스트에서는 같은 값이 들어가면 false가 나왔는데 이건 왜 들어가질까
		// >> String이 아닌 것은 equals와 hashCode를 구현해야 한다.
		Member memberLee2 = new Member(101, "이몽룡");
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showAll();
	}

}
