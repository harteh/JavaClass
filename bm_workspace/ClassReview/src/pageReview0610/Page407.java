package pageReview0610;

import java.util.HashSet;

//p.407, 427
class Member {
	private int memberId;
	private String memberName;
	
	Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	int getMemberId() {
		return memberId;
	}
	void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	String getMemberName() {
		return memberName;
	}
	void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName+" ȸ������ ���̵�� "+memberId+"�Դϴ�.";
	}
	
	//p.427
	@Override
	public int hashCode() {
		return memberId;	//ȸ��ID�� ��ȯ�ϵ��� ������
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		if(this.memberId == member.memberId) {
			return true;
		}
		else {
			return false;
		}
	}
}

//p.424
class MemberHashSet {
	private HashSet<Member> hashSet;
	
	MemberHashSet(){
		hashSet = new HashSet<Member>();
	}
	
	void addMember(Member member) {
		hashSet.add(member);
	}
	void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
	}
}

public class Page407 {
	public static void main(String[] args) {
		// p.426
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
//		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();

	}
}
