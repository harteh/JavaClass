package pageReview0610;

import java.util.ArrayList;
import java.util.HashSet;

//p.407, 427
//407,408,410,411,412
//p.410
class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	void addMember(Member member) {
		arrayList.add(member);
	}
	
	boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId +"가 존재하지 않습니다.");
		return false;
	}
	
	void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
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

public class Page410 {
	public static void main(String[] args) {
		// p.411,412
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
		/* p.426
		 *
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		*/
	}
}
