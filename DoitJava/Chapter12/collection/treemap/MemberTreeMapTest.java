package collection.treemap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		//���ĵ� ����: Key���� Compare�� ������ Integer�� ���� �Ǿ��־.
		Member memberLee = new Member(102,"�̼���");
		Member memberKim = new Member(101,"������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberShin);
		
		memberTreeMap.showAllMember();
		
	//	memberTreeMap.removeMember(102); //����
		
	//	memberTreeMap.showAllMember();

	}

}
