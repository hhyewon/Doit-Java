package collection.treemap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		//정렬된 이유: Key값이 Compare가 구현된 Integer로 구성 되어있어서.
		Member memberLee = new Member(102,"이순신");
		Member memberKim = new Member(101,"김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberShin);
		
		memberTreeMap.showAllMember();
		
	//	memberTreeMap.removeMember(102); //삭제
		
	//	memberTreeMap.showAllMember();

	}

}
