package collection.hashset;
import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashset; //������ ��Ű���� �ƴ϶� ������ ���. ����Ʈ �ϱ�
	
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
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		for(Member member: hashset) {
			System.out.println(member);
		}
		//System.out.println(hashset);
	}
	
}
