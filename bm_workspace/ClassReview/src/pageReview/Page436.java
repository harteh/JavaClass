package pageReview;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//p.436
class Member2 implements Comparator<Member2>{
	private int memberId;
	private String memberName;
	
	Member2(int memberId, String memberName){
		this.memberId=memberId;		this.memberName=memberName;
	}
	
	int getMemberId() {
		return getMemberId();
	}
	String getMemberName() {
		return getMemberName();
	}
	
	void setMemberId(int memeberId) {
		this.memberId = memberId;
	}
	void setMemberName(String memberName) {
		this.memberName=memberName;
	}
	
	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는 "+memberId+" 입니다.";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		Member2 member = (Member2)obj;
		if(this.memberId == member.memberId)
			return true;
		else
			return false;
	}

	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}
}

//p.437
class MyCompare implements Comparator<String>{
	public int compare(String s1, String s2) {
		return(s1.compareTo(s2)) * -1;	//내림차순 정렬
	}
}
public class Page436 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");

		System.out.println(set);
	}
}
