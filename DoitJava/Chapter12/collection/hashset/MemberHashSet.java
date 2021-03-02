package collection.hashset;
import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashset; //동일한 패키지가 아니라서 오류가 뜬것. 임포트 하기
	
	public MemberHashSet() {
		hashset = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashset.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> iterator = hashset.iterator();
		while(iterator.hasNext()) { 
			Member member =iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId==tempId) {
				hashset.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member: hashset) {
			System.out.println(member);
		}
		//System.out.println(hashset);
	}
	
}
