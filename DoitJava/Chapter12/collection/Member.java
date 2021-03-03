package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{

	private int memberId;
	private String memberName;
	
	//Comparator 사용 시 추가
	public Member() {} //디폴트
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 "+ memberId + "입니다.";
	}

	@Override
	public int hashCode() { //같은 사람이면 같은 id가 반환
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;

	}
	/*
	@Override
	public int compareTo(Member member) { 
		
		return (this.memberId - member.memberId); //양수를 반환되면 오름차순으로 트리가 구성
		//뒤집으면 혹은 음수로*(-1) 해주면 내림차순
	}
	*/
	
	
	//String은 이미 Compare가 구성되있다.
	@Override
	public int compareTo(Member member) { 
		
		return (this.memberName.compareTo(member.memberName)); //오름차순
		
	}

	//Comparator
	@Override
	public int compare(Member member1, Member member2)  {

		return (member1.memberId - member2.memberId);
	}
	
}
