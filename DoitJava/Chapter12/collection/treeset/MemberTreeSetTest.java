package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
//������ ��ü�� ���� equals�� hashcode�� �����ؾ� �Ѵ�.
	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		
		Member memberLee = new Member(102,"�̼���");
		Member memberKim = new Member(101,"������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberShin);
		
		memberTreeSet.showAll();
		
	}

}