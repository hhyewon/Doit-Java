package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet{

	//TreeSet안에서 Member를 가지고 쓰면 이건 어떻게 비교를 해서 트리를 구성할 지 정해져 있지않아서 오류가 생긴다.
	// >>Compare를 해준다
	private TreeSet<Member> treeset;
 
	
	public MemberTreeSet() {
		//Comparator 사용시 new Member() 추가
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
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member: treeset) {
			System.out.println(member);
		}
		//System.out.println(treeset);
	}


	
}
