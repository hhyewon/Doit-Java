package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet{

	//TreeSet�ȿ��� Member�� ������ ���� �̰� ��� �񱳸� �ؼ� Ʈ���� ������ �� ������ �����ʾƼ� ������ �����.
	// >>Compare�� ���ش�
	private TreeSet<Member> treeset;
 
	
	public MemberTreeSet() {
		//Comparator ���� new Member() �߰�
		treeset = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> iterator = treeset.iterator();
		while(iterator.hasNext()) { 
			Member member =iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId==tempId) {
				treeset.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		for(Member member: treeset) {
			System.out.println(member);
		}
		//System.out.println(treeset);
	}


	
}
